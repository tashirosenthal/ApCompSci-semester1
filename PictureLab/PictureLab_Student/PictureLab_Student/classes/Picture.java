import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class Picture extends SimplePicture 
{
  public Picture()
  {
    super();  
  }
  public Picture(String fileName)
  {
    super(fileName);
  }
  public Picture(int height, int width)
  {
    super(width,height);
  }
  public Picture(Picture copyPicture)
  {
    super(copyPicture);
  }
  public Picture(BufferedImage image)
  {
    super(image);
  }
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }
  
  public void keepOnlyRed()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
		pixelObj.setGreen(0);
      }
    }
  }
  
  public void keepOnlyGreen()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setBlue(0);
      }
    }
  }
  public void negate()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255- pixelObj.getRed());
		pixelObj.setGreen(255 - pixelObj.getGreen());
		pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  public void fixUnderwater()
  {
	  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(2 * pixelObj.getRed()/3);
		pixelObj.setGreen(2 * pixelObj.getGreen()/3);
		pixelObj.setBlue(2 * pixelObj.getBlue()/3);
      }
    }
  }
  }
  
  public void grayscale()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int avg = (pixelObj.getBlue()+ pixelObj.getGreen() + pixelObj.getBlue())/3;
		pixelObj.setBlue(avg);
		pixelObj.setRed(avg);
		pixelObj.setGreen(avg);
      }
    }
  }
  
	public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorVerticalRightoLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  public void mirrorHorizontal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++)
      {
          for (int col = 0; col < pixels[0].length; col++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              bottomPixel.setColor(topPixel.getColor());
          }
      }
  }
  public void mirrorHorizontalBottomToTop()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++)
      {
          for (int col = 0; col < pixels[0].length; col++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              topPixel.setColor(bottomPixel.getColor());
          }
      }
  }
  
  public void mirrorDiagonal() 
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topRightPixel = null;
      Pixel bottomLeftPixel = null;
      int maxLength;
      if (pixels.length < pixels[0].length) { maxLength = pixels.length; }
      else {maxLength = pixels[0].length; }
      
      for (int row = 0; row < maxLength; row++)
      {
          for (int col = row; col < maxLength; col++)
          {
              topRightPixel = pixels[col][row];
              bottomLeftPixel = pixels[row][col];
              bottomLeftPixel.setColor(topRightPixel.getColor());
          }
      }
  }
   public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 27; row < 97; row++)
    {
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
        [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
    public void mirrorArms()
  {
    int mirrorPoint = 194;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    for (int row = 158; row < mirrorPoint; row++)
    {
     
      for (int col = 104; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    int mirrorPoint2 = 194;
    Pixel topPixel2 = null;
    Pixel bottomPixel2 = null;
    

    for (int row = 174; row < mirrorPoint2; row++)
    {

      for (int col = 240; col < 296; col++)
      {
        topPixel2 = pixels[row][col];      
        bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
        bottomPixel2.setColor(topPixel2.getColor());
      }
    }
  }
  public void mirrorGull()
  {
    int mirrorPoint = 345;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();   
    
    for (int row = 236; row < 324; row++)
    {
      for (int col = 240; col < mirrorPoint; col++)
      {
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
    
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
   public void copy(Picture fromPic, int fromRowStart,  
										int fromColStart,
										int fromRowEnd, 
										int fromColEnd,
										int toRow,
										int toCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
	
	System.out.println(toPixels.length);
	System.out.println(fromPixels.length);
    for (int fromRow = fromRowStart; 
			fromRow <= fromRowEnd && toRow < toPixels.length; 
			fromRow++, toRow++)
    {
      for (int fromCol = fromColStart; 
				fromCol < fromColEnd && toCol < toPixels[toRow].length; 
				fromCol++, toCol++)  
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    } 
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
   public void myCollage()
  {
      Picture koala = new Picture("koala.jpg");
      this.copy(koala, 182, 279, 214, 303, 383, 300);
      this.write("c:/Users/nrosenthal0004Desktop/collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
	Pixel bottomPixel = null;
    Color bottomColor = null;
	for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        bottomPixel = pixels[row+1][col];
        bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(bottomColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
	
  }
  
}
