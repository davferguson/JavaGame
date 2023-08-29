package com.gameengine.launch;

import com.gameengine.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args){

        System.out.println(Version.getVersion());

        WindowManager window = new WindowManager("DARED ENGINE", 800, 800, false);
        window.init();

        //while window not closed, update()
        while(!window.windowShouldClose()){
            window.update();
        }

        window.cleanup();
    }
}
