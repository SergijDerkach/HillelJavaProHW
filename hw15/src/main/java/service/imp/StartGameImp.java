package service.imp;

import service.interf.StartGameServ;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StartGameImp implements StartGameServ {
    @Override
    public void writingToFile(String str) throws IOException {
        File nameResultFile = new File("resultGame.txt");
        String absPathToFile = nameResultFile.getAbsolutePath();

        boolean isFile = false;

        if(!nameResultFile.exists()){
            try {
                isFile = nameResultFile.createNewFile();
                if (isFile){

                    OutputStream outputStream = new FileOutputStream(absPathToFile);
                    outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                    outputStream.write(" \n".getBytes(StandardCharsets.UTF_8));
                    outputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            OutputStream outputStream = new FileOutputStream(absPathToFile,true);
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.write(" \n".getBytes(StandardCharsets.UTF_8));
            outputStream.close();
        }
    }
}
