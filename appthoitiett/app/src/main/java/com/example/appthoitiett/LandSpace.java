package com.example.appthoitiett;

public class LandSpace {
    String landImageFileName;
    String landCation1,landCation2;

    public LandSpace(String landImageFileName, String landCation1, String landCation2) {
        this.landImageFileName = landImageFileName;
        this.landCation1 = landCation1;
        this.landCation2 = landCation2;
    }

    public String getLandImageFileName()
    {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCation1() {

        return landCation1;
    }

    public void setLandCation1(String landCation1) {

        this.landCation1 = landCation1;
    }

    public String getLandCation2()
    {
        return landCation2;
    }

    public void setLandCation2(String landCation2)
    {
        this.landCation2 = landCation2;
    }


}




