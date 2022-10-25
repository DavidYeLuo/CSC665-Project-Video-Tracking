package ImageReader;

import org.opencv.core.Mat;

public abstract class FileManager
{
    protected String readPath;
    protected String savePath;
    /**
     * Reads image from file path.
     * @param readTo Saves image to this param
     * @return true when succeeded and false when failed
     */
    public abstract boolean read(Mat readTo);
    public abstract void write(Mat source);
    public abstract void release();
}