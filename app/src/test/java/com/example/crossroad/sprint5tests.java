 package com.example.crossroad;
 import com.example.crossroad.entities.Log;

 import android.graphics.Bitmap;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.graphics.Canvas;
 import android.graphics.Rect;

 import static org.junit.Assert.*;
 import org.junit.runner.RunWith;
 import org.robolectric.RobolectricTestRunner;
 import org.robolectric.annotation.Config;
 import org.junit.Before;
 import org.junit.Test;

 @RunWith(RobolectricTestRunner.class)
 @Config(manifest = Config.NONE)
public class sprint5tests {
     private Bitmap testBitmap;
     private Log testLog;

     @Before
     public void setUp() {
         // Create a test bitmap for the Log
         testBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
         Canvas canvas = new Canvas(testBitmap);
         Paint paint = new Paint();
         paint.setColor(Color.BLACK);
         canvas.drawRect(new Rect(0, 0, 50, 50), paint);

         // Create a test Log
         testLog = new Log(0, 0, testBitmap);
     }
     @Test
     public void testGetLogImage() {
         Bitmap bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(0, 0, bitmap);
         assertEquals(bitmap, log.getLogImage());
     }

     @Test
     public void testGetLogSpeed() {
         assertEquals(3, Log.getLogSpeed());
     }

     @Test
     public void testLogConstructor() {
         assertNotNull(testLog);
         assertEquals(testBitmap, testLog.getLogImage());
         assertEquals(0, testLog.getLogxPos());
         assertEquals(0, testLog.getLogyPos());
     }
     @Test
     public void testGetLogxPos() {
         Bitmap bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(50, 0, bitmap);
         assertEquals(50, log.getLogxPos());
     }

     @Test
     public void testSetLogxPos() {
         Bitmap bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(50, 0, bitmap);
         log.setLogxPos(100);
         assertEquals(100, log.getLogxPos());
     }
     @Test
     public void testLogImageNotNull() {
         Bitmap bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(50, 0, bitmap);
         assertNotNull(log.getLogImage());
     }

     @Test
     public void testGetLogyPos() {
         Bitmap bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(0, 50, bitmap);
         assertEquals(50, log.getLogyPos());
     }
     @Test
     public void testLogCreation() {
         Bitmap logImage = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(0, 0, logImage);

         assertNotNull(log);
         assertEquals(logImage, log.getLogImage());
         assertEquals(3, Log.getLogSpeed());
         assertEquals(0, log.getLogxPos());
         assertEquals(0, log.getLogyPos());
     }
     @Test
     public void testSetAndGetLives() {
         int lives = 3;
         GameConstants.setLives(lives);
         int result = GameConstants.getLives();
         assertEquals(lives, result);
     }
     @Test
     public void testSetScore() {
         int score = 500;
         GameConstants.setScore(score);
         int result = GameConstants.getScore();
         assertEquals(score, result);
     }

     @Test
     public void testGetLogSpeedNotNegative() {
         Bitmap logImage = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
         Log log = new Log(0, 0, logImage);
         int logSpeed = log.getLogSpeed();
         assertEquals(logSpeed >= 0, true);
     }

}
