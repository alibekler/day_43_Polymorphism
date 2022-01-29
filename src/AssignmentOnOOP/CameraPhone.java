package AssignmentOnOOP;

public class CameraPhone {

    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(int imageSize, int memorySize){
        int memInMbs = memorySize*1000;

       return memInMbs/imageSize;
    }


}
