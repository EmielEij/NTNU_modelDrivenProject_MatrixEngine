import org.eclipse.emf.ecore.resource.Resource
import no.ntnu.tdt4250.matrixgame.game.Grid
import no.ntnu.tdt4250.matrixgame.game.Game
import no.ntnu.tdt4250.matrixgame.game.Row
import no.ntnu.tdt4250.matrixgame.game.Cell
import java.nio.file.Paths
import java.io.IOException
import java.nio.file.Files

class CodeGenerator {

    //Start code generation
    def static generateGame(Resource resource) {
        resource.allContents.filter(Game).forEach [ game |
            val generatedCode = generateGameCode(game)
            saveToFile(generatedCode.toString, game.getGameName())
        ]
    }

    //Generate code for a specific game config
    def static generateGameCode(Game game) {
        '''
			package generated;
			
			public class «game.getGameName()» {
			    private int mapSize = «game.getMapLength()»;
			    private String[][] cells = new char[mapSize][mapSize];
			
			    public «game.getGameName()»() {
			    initializeCells();
			    }
			
			    private void initializeCells() {
			    //Add characters from each cell in the grid
			    
			    int rowIndex = 0;
			    «FOR row : game.getGrid().getRow()»
			    	int colIndex = 0;
			    	«FOR cell : row.getCells()»
			    		cells[rowIndex][colIndex] = 'X'; 
			    		colIndex++;
			    	«ENDFOR»
			    	rowIndex++;
			    «ENDFOR»
			    
			    }
			    
			
			
			    public void start() {
			    System.out.println("Starting the game «game.getGameName()»!");
			    displayGrid();
			    }
			
			    private void displayGrid() {
			    for (int i = 0; i < mapSize; i++) {
			        for (int j = 0; j < mapSize; j++) {
			            System.out.print(cells[i][j] + " ");
			        }
			        System.out.println();
			    }
			    }
			}
		'''
    }

	//'«cell.getCharacter()»';
    //Save code to file
    def static saveToFile(String code, String gameName) {
        val path = "src/generated/" + gameName + ".java"
        try {
            Files.createDirectories(Paths.get(path).getParent())
            Files.write(Paths.get(path), code.getBytes)
            println("Generated code saved to " + path)
        } catch (IOException e) {
            e.printStackTrace
        }
    }
}
