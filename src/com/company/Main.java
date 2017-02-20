package com.company;

import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args) {
	    BitmapHelper helper = BitmapHelper.getInstance();
        BufferedImage img = helper.getImage("C:\\Users\\Gleb\\IdeaProjects\\DetectFigures\\name.png");
        int[][] binaryPixels = helper.getPixels(img);
        helper.analyzeNoise(binaryPixels);
        helper.getNumObjects(binaryPixels);
        helper.getMarkers(binaryPixels);
    }
}
