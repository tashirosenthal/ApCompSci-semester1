public class PictureTester
{
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testNegate()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  } 
   public static void testKeepOnlyRed()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
   public static void testKeepOnlyGreen()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
    public static void testGrayscale()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
<<<<<<< HEAD
	public static void testFixUnderwater()
	{
		Picture beach = new Picture("water.jpg");
		beach.explore();
		beach.fixUnderwater();
		beach.explore();
	}
=======
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
	Picture bob = new Picture("redMotorcycle.jpg");
    bob.explore();
    bob.mirrorHorizontal();
    bob.explore();
  } 
  public static void testmirrorVerticalRightToLeft()
  {
	Picture bob = new Picture("redMotorcycle.jpg");
    bob.explore();
    bob.mirrorVerticalRightoLeft();
    bob.explore();
  }
  public static void testHorizonalBotToTop()
  {
	 Picture bob = new Picture("redMotorcycle.jpg");
	 bob.explore();
	 bob.mirrorHorizontalBottomToTop();
	 bob.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
	  Picture snow = new Picture("snowman.jpg");
	  snow.explore();
	  snow.mirrorArms();
	  snow.explore();
  }
  public static void testMirrorGull()
  {
	Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
    /** Method to test the myCollage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("koala.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  /** Method to test edgeDetection */
<<<<<<< HEAD
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
	swan.explore();
    swan.edgeDetection2(20);
=======
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
<<<<<<< HEAD
	//testFixUnderwater();
=======
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
	//testHorizonalBotToTop();
	//testmirrorVerticalRightToLeft();
	//testMirrorHorizontal(); 
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
<<<<<<< HEAD
    //testMirrorArms();
=======
    testMirrorArms();
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy2();
    //testEdgeDetection();
<<<<<<< HEAD
    testEdgeDetection2();
=======
    //testEdgeDetection2();
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}