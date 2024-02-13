package uz.m1nex.adobeinfo;

public class Program {
    private final int imgResId;
    private final String programName;
    private final String type;
    private final int color;
    private final int programDescription;

    public Program(int imgResId, String programName, String type, int color, int programDescription) {
        this.imgResId = imgResId;
        this.programName = programName;
        this.type = type;
        this.color = color;
        this.programDescription = programDescription;
    }

    public int getImgResId() {
        return imgResId;
    }

    public String getProgramName() {
        return programName;
    }

    public int getProgramDescription() {
        return programDescription;
    }

    public String getType() {
        return type;
    }

    public int getColor() {
        return color;
    }
}
