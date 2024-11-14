import com.google.common.collect.Iterators;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import no.ntnu.tdt4250.matrixgame.game.Cell;
import no.ntnu.tdt4250.matrixgame.game.Game;
import no.ntnu.tdt4250.matrixgame.game.Row;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CodeGenerator {
  public static void generateGame(final Resource resource) {
    final Procedure1<Game> _function = (Game game) -> {
      final CharSequence generatedCode = CodeGenerator.generateGameCode(game);
      CodeGenerator.saveToFile(generatedCode.toString(), game.getGameName());
    };
    IteratorExtensions.<Game>forEach(Iterators.<Game>filter(resource.getAllContents(), Game.class), _function);
  }

  public static CharSequence generateGameCode(final Game game) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _gameName = game.getGameName();
    _builder.append(_gameName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private int mapSize = ");
    int _mapLength = game.getMapLength();
    _builder.append(_mapLength, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private String[][] cells = new char[mapSize][mapSize];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _gameName_1 = game.getGameName();
    _builder.append(_gameName_1, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("initializeCells();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void initializeCells() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//Add characters from each cell in the grid");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("int rowIndex = 0;");
    _builder.newLine();
    {
      EList<Row> _row = game.getGrid().getRow();
      for(final Row row : _row) {
        _builder.append("    ");
        _builder.append("int colIndex = 0;");
        _builder.newLine();
        {
          EList<EList<Cell>> _cells = row.getCells();
          for(final EList<Cell> cell : _cells) {
            _builder.append("    ");
            _builder.append("cells[rowIndex][colIndex] = \'X\'; ");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("colIndex++;");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("rowIndex++;");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void start() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("System.out.println(\"Starting the game ");
    String _gameName_2 = game.getGameName();
    _builder.append(_gameName_2, "    ");
    _builder.append("!\");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("displayGrid();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void displayGrid() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (int i = 0; i < mapSize; i++) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int j = 0; j < mapSize; j++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.out.print(cells[i][j] + \" \");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static String saveToFile(final String code, final String gameName) {
    String _xblockexpression = null;
    {
      final String path = (("src/generated/" + gameName) + ".java");
      String _xtrycatchfinallyexpression = null;
      try {
        String _xblockexpression_1 = null;
        {
          Files.createDirectories(Paths.get(path).getParent());
          Files.write(Paths.get(path), code.getBytes());
          _xblockexpression_1 = InputOutput.<String>println(("Generated code saved to " + path));
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
}
