package com.examples.designPatterns.behavioural.visitor;

//Concrete Visitor
public class UploadOnS3 implements MediaProcessor {
    @Override
    public void visit(Audio audio) {
        System.out.println("Saved on S3 " + audio);
    }

    @Override
    public void visit(Video video) {
        System.out.println("Saved on S3 " + video);
    }

    @Override
    public void visit(Image image) {
        System.out.println("Saved on S3 " + image);
    }
}
