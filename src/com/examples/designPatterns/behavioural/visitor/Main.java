package com.examples.designPatterns.behavioural.visitor;

public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Video video = new Video();
        Image image = new Image();

        SaveOnDB saveOnDB = new SaveOnDB();
        UploadOnS3 uploadOnS3 = new UploadOnS3();

        //Saved on DB Audio{}
        audio.accept(saveOnDB);

        //Saved on S3 Audio{}
        audio.accept(uploadOnS3);

        //Saved on DB Video{}
        video.accept(saveOnDB);

        //Saved on S3 Video{}
        video.accept(uploadOnS3);

        //Saved on DB Image{}
        image.accept(saveOnDB);

        //Saved on S3 Image{}
        image.accept(uploadOnS3);

    }
}
