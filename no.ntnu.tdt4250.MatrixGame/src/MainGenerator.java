import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;

public class MainGenerator {
    public static void main(String[] args) {
        
        ResourceSetImpl resourceSet = new ResourceSetImpl();
        EPackage.Registry.INSTANCE.put("http://www.ntnu.no/tdt4250/MatrixGame", GamePackage.eINSTANCE);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        String modelFilePath = "model/TicTacToe.xmi"; // Ensure this is the correct path
        
        URI fileURI = URI.createFileURI(modelFilePath);
        Resource resource = null;
        
        try {
            //Load model
            resource = resourceSet.getResource(fileURI, true);
            System.out.println("Model loaded: " + resource.getContents());
            
            //Generate code based on model
            CodeGenerator.generateGame(resource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
