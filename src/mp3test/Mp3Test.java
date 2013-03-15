/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3test;

import java.io.File;
import javax.media.Format;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.PlugInManager;
import javax.media.format.AudioFormat;

public class Mp3Test
{
     public static void main(String[] args) {
         	Format input1 = new AudioFormat(AudioFormat.MPEGLAYER3);
		Format input2 = new AudioFormat(AudioFormat.MPEG);
		Format output = new AudioFormat(AudioFormat.LINEAR);
                PlugInManager.addPlugIn(
		"com.sun.media.codec.audio.mp3.JavaDecoder",
		new Format[]{input1, input2},
		new Format[]{output},
		PlugInManager.CODEC
		);
        try {
            
            Player player = Manager.createPlayer(new MediaLocator(new File("D:/JAVA/Mp3Test/build/classes/1.mp3").toURI().toURL()));
            player.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                 
     }
}
