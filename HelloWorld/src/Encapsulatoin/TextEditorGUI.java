package Encapsulatoin;
//
///**
// * Implemented with encapsulation in mind by making cut() and paste() functions public and data as private.
// * At 1st we are trying to do the 1st implementation where we are storing the data as String only.
// * Later we are modifying the implementation to support the storage of Strings as well as Graphic Objects.
// * Below is the implementation 1.
// */
//public class TextEditorGUI {
//    private String screenShot = "Let say whatever is present on the screen will be captured by this screenShot private variable.";
//    private ClipBoard clipBoard;
//
//    TextEditorGUI(){
//        clipBoard = new ClipBoard();
//    }
//
//    public void cut(){
//        clipBoard.copy(screenShot);
//        screenShot = "";
//    }
//
//    public void paste(){
//        screenShot = clipBoard.paste();
//    }
//
//    public void printScreen(){
//        System.out.println(screenShot);
//    }
//
//}
//
//
//class ClipBoard{
//    private String bufferReader;
//
//    public void copy(String bufferReader){
//        this.bufferReader = bufferReader;
//    }
//
//    public String paste(){
//        return this.bufferReader;
//    }
//}
//

/**
 * Let's alter the implementation of TextEditorGUI by saving the screenshot with both text and graphic objects.
 * Both the implementations of TextEditorGUI will bring the same results in Application.
 */
public class TextEditorGUI {
    private CompactData compactData = new CompactData("Assuming this is the text on the screen. ", "Assuming this is the Graphic Objects on teh screen.");
    private ClipBoard clipBoard;

    TextEditorGUI(){
        clipBoard = new ClipBoard();
    }

    public void cut(){
        clipBoard.copy(compactData);
        compactData.setText("");
        compactData.setGraphicObject("");
    }

    public void paste(){
        CompactData compactData1 = clipBoard.paste();
        compactData.setText(compactData1.getText());
        compactData.setGraphicObject(compactData1.getGraphicObject());
    }

    public void printScreen(){
        System.out.println(compactData.getText() + compactData.getGraphicObject());
    }

}

class ClipBoard{
    private CompactData compactData = new CompactData();

    public void copy(CompactData compactData){
        this.compactData.setText(compactData.getText());
        this.compactData.setGraphicObject(compactData.getGraphicObject());
    }

    public CompactData paste(){
        return this.compactData;
    }
}

class CompactData{
    private String text;
    private String graphicObject; // Assuming the graphic object is also a string for simplicity

    CompactData(){};

    CompactData(String text, String graphicObject){
        this.graphicObject = graphicObject;
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setGraphicObject(String graphicObject){
        this.graphicObject = graphicObject;
    }

    public String getText(){return text;}

    public String getGraphicObject(){return graphicObject;}
}