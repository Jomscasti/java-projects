import java.awt.*;

public class MyCanvas extends Canvas {
	public void paint(Graphics g) {
		setBackground(Color.GRAY);
		
		//Eto yung ears
		
		g.setColor(new Color(39, 39, 39));
		int xShape1[] = {9, 60, 83};
		int yShape1[] = {60, 131, 127};
		g.fillPolygon(new Polygon(xShape1, yShape1, xShape1.length));

		g.setColor(new Color(29, 29, 29));
		int xShape2[] = {9, 83, 88};
		int yShape2[] = {60, 127, 70};
		g.fillPolygon(new Polygon(xShape2, yShape2, xShape2.length));

		g.setColor(new Color(18, 18, 18));
		int xShape3[] = {9, 88, 86};
		int yShape3[] = {60, 93, 112};
		g.fillPolygon(new Polygon(xShape3, yShape3, xShape3.length));

		g.setColor(new Color(29, 29, 29));
		int xShape4[] = {9, 88, 83};
		int yShape4[] = {60, 93, 89};
		g.fillPolygon(new Polygon(xShape4, yShape4, xShape4.length));

		g.setColor(new Color(9, 25, 21));
		int xShape5[] = {83, 85, 93, 93};
		int yShape5[] = {78, 111, 114, 88};
		g.fillPolygon(new Polygon(xShape5, yShape5, xShape5.length));
		
		g.setColor(new Color(9, 25, 21));
		int xShape6[] = {85, 81, 108, 97, 92};
		int yShape6[] = {111, 128, 161, 134, 114};
		g.fillPolygon(new Polygon(xShape6, yShape6, xShape6.length));
		
		g.setColor(new Color(238, 158, 21));
		int xShape7[] = {86, 89, 134};
		int yShape7[] = {70, 115, 111};
		g.fillPolygon(new Polygon(xShape7, yShape7, xShape7.length));
		
		g.setColor(new Color(214, 158, 83));
		int xShape8[] = {89, 110, 181, 138, 93};
		int yShape8[] = {114, 167, 159, 149, 115};
		g.fillPolygon(new Polygon(xShape8, yShape8, xShape8.length));

		g.setColor(new Color(249, 161, 71));
		int xShape9[] = {92, 138, 133};
		int yShape9[] = {115, 149, 110};
		g.fillPolygon(new Polygon(xShape9, yShape9, xShape9.length));
		
		g.setColor(new Color(253, 185, 41));
		int xShape13[] = {133, 138, 181};
		int yShape13[] = {111, 149, 159};
		g.fillPolygon(new Polygon(xShape13, yShape13, xShape13.length));
		
		g.setColor(new Color(243, 242, 4));
		int xShape14[] = {133, 181, 199};
		int yShape14[] = {111, 159, 152};
		g.fillPolygon(new Polygon(xShape14, yShape14, xShape14.length));
		
		g.setColor(new Color(195, 141, 41));
		int xShape10[] = {110, 141, 181};
		int yShape10[] = {167, 183, 159};
		g.fillPolygon(new Polygon(xShape10, yShape10, xShape10.length));
		
		g.setColor(new Color(183, 128, 38));
		int xShape11[] = {141, 195, 181};
		int yShape11[] = {183, 192, 159};
		g.fillPolygon(new Polygon(xShape11, yShape11, xShape11.length));
		
		g.setColor(new Color(236, 194, 0));
		int xShape12[] = {181, 194, 219, 200};
		int yShape12[] = {159, 192, 178, 152};
		g.fillPolygon(new Polygon(xShape12, yShape12, xShape12.length));
		
		g.setColor(new Color(249, 233, 50));
		int xShape15[] = {219, 194, 178, 217};
		int yShape15[] = {178, 192, 207, 209};
		g.fillPolygon(new Polygon(xShape15, yShape15, xShape15.length));
		
		g.setColor(new Color(249, 204, 17));
		int xShape16[] = {217, 218, 242};
		int yShape16[] = {209, 178, 199};
		g.fillPolygon(new Polygon(xShape16, yShape16, xShape16.length));
		
		g.setColor(new Color(249, 204, 17));
		int xShape17[] = {177, 219, 200};
		int yShape17[] = {206, 209, 227};
		g.fillPolygon(new Polygon(xShape17, yShape17, xShape17.length));
		
		// ito yung head
		
		g.setColor(new Color(243, 215, 90));
		int xShape18[] = {217, 242, 252};
		int yShape18[] = {178, 199, 182};
		g.fillPolygon(new Polygon(xShape18, yShape18, xShape18.length));
		
		g.setColor(new Color(245, 232, 5));
		int xShape19[] = {217, 275, 252};
		int yShape19[] = {178, 167, 182};
		g.fillPolygon(new Polygon(xShape19, yShape19, xShape19.length));
		
		g.setColor(new Color(244, 207, 9));
		int xShape20[] = {287, 275, 252};
		int yShape20[] = {183, 167, 182};
		g.fillPolygon(new Polygon(xShape20, yShape20, xShape20.length));
		
		g.setColor(new Color(249, 235, 100));
		int xShape21[] = {242, 287, 252};
		int yShape21[] = {199, 183, 182};
		g.fillPolygon(new Polygon(xShape21, yShape21, xShape21.length));
		
		g.setColor(new Color(245, 188, 59));
		int xShape22[] = {275, 287, 333};
		int yShape22[] = {167, 183, 186};
		g.fillPolygon(new Polygon(xShape22, yShape22, xShape22.length));
		
		g.setColor(new Color(245, 188, 59));
		int xShape23[] = {275, 287, 333};
		int yShape23[] = {167, 183, 186};
		g.fillPolygon(new Polygon(xShape23, yShape23, xShape23.length));
		
		g.setColor(new Color(245, 234, 93));
		int xShape24[] = {312, 287, 333, 343};
		int yShape24[] = {239, 183, 186, 189};
		g.fillPolygon(new Polygon(xShape24, yShape24, xShape24.length));
		
		g.setColor(new Color(240, 231, 52));
		int xShape25[] = {371, 312, 343};
		int yShape25[] = {202, 239, 189};
		g.fillPolygon(new Polygon(xShape25, yShape25, xShape25.length));
		
		g.setColor(new Color(245, 151, 50));
		int xShape26[] = {371, 312, 393};
		int yShape26[] = {202, 239, 236};
		g.fillPolygon(new Polygon(xShape26, yShape26, xShape26.length));
		
		g.setColor(new Color(241, 152, 48));
		int xShape27[] = {371, 312, 393};
		int yShape27[] = {258, 239, 236};
		g.fillPolygon(new Polygon(xShape27, yShape27, xShape27.length));
		
		g.setColor(new Color(242, 158, 53));
		int xShape28[] = {393, 371, 384, 398};
		int yShape28[] = {236, 258, 272, 271};
		g.fillPolygon(new Polygon(xShape28, yShape28, xShape28.length));
		
		g.setColor(new Color(242, 195, 53));
		int xShape29[] = {312, 371, 384, 398, 394, 374, 356, 331};
		int yShape29[] = {239, 258, 272, 271, 293, 284, 266, 271};
		g.fillPolygon(new Polygon(xShape29, yShape29, xShape29.length));
		
		g.setColor(new Color(244, 186, 60));
		int xShape30[] = {312, 331, 315, 294};
		int yShape30[] = {239, 271,285, 255};
		g.fillPolygon(new Polygon(xShape30, yShape30, xShape30.length));
		
		g.setColor(new Color(249, 235, 93));
		int xShape31[] = {312, 294, 265};
		int yShape31[] = {239, 255, 235};
		g.fillPolygon(new Polygon(xShape31, yShape31, xShape31.length));
		
		g.setColor(new Color(251, 193, 60));
		int xShape32[] = {312, 265, 265, 287};
		int yShape32[] = {239, 235, 221, 183};
		g.fillPolygon(new Polygon(xShape32, yShape32, xShape32.length));
		
		g.setColor(new Color(250, 185, 65));
		int xShape33[] = {265, 265, 287, 242};
		int yShape33[] = {235, 221, 183, 199};
		g.fillPolygon(new Polygon(xShape33, yShape33, xShape33.length));
		
		g.setColor(new Color(251, 254, 255));
		int xShape34[] = {331, 331, 352, 357};
		int yShape34[] = {271, 290, 280, 266};
		g.fillPolygon(new Polygon(xShape34, yShape34, xShape34.length));
		
		//eyes
		g.setColor(new Color(17, 17, 17));
		int xShape35[] = {331, 338, 349, 356, 371, 371, 356, 352};
		int yShape35[] = {290, 306, 310, 310, 303, 281, 266, 280};
		g.fillPolygon(new Polygon(xShape35, yShape35, xShape35.length));
		
		// continuation ng body
		g.setColor(new Color(241, 156, 40));
		int xShape36[] = {371, 374, 394, 382, 368, 371,};
		int yShape36[] = {281, 284, 293, 331, 304, 303,};
		g.fillPolygon(new Polygon(xShape36, yShape36, xShape36.length));
		
		g.setColor(new Color(248, 148, 57));
		int xShape37[] = {356, 338, 382, 368};
		int yShape37[] = {310, 335, 331, 304};
		g.fillPolygon(new Polygon(xShape37, yShape37, xShape37.length));
		
		g.setColor(new Color(241, 136, 55));
		int xShape38[] = {331, 315, 302, 304, 338, 331, 331};
		int yShape38[] = {271, 285, 293, 299, 306, 290, 271};
		g.fillPolygon(new Polygon(xShape38, yShape38, xShape38.length));
		
		g.setColor(new Color(244, 192, 52));
		int xShape39[] = {304, 292, 304, 324, 338, 356, 349, 338, 304};
		int yShape39[] = {299, 310, 317, 317, 335, 310, 310, 306, 299};
		g.fillPolygon(new Polygon(xShape39, yShape39, xShape39.length));
		
		g.setColor(new Color(253, 188, 62));
		int xShape40[] = {315, 294, 274, 292, 304, 302, 315};
		int yShape40[] = {285, 278, 293, 310, 299, 293, 285};
		g.fillPolygon(new Polygon(xShape40, yShape40, xShape40.length));
		
		g.setColor(new Color(248, 195, 65));
		int xShape41[] = {265, 265, 294, 315, 294};
		int yShape41[] = {235, 271, 278, 285, 255};
		g.fillPolygon(new Polygon(xShape41, yShape41, xShape41.length));
		
		g.setColor(new Color(249, 191, 68));
		int xShape42[] = {265, 239, 250, 265};
		int yShape42[] = {235, 255, 271, 271};
		g.fillPolygon(new Polygon(xShape42, yShape42, xShape42.length));
		
		g.setColor(new Color(4, 3, 0));
		int xShape43[] = {261, 265, 294, 274};
		int yShape43[] = {271, 271, 278, 293};
		g.fillPolygon(new Polygon(xShape43, yShape43, xShape43.length));
		
		g.setColor(new Color(159, 32, 43));
		int xShape44[] = {382, 394, 356, 377};
		int yShape44[] = {330, 365, 390, 349};
		g.fillPolygon(new Polygon(xShape44, yShape44, xShape44.length));
		
		g.setColor(new Color(210, 56, 32));
		int xShape45[] = {338, 336, 356, 377, 382};
		int yShape45[] = {335, 375, 390, 349, 331};
		g.fillPolygon(new Polygon(xShape45, yShape45, xShape45.length));
		
		g.setColor(new Color(238, 127, 46));
		int xShape46[] = {336, 317, 356};
		int yShape46[] = {375, 400, 390};
		g.fillPolygon(new Polygon(xShape46, yShape46, xShape46.length));
		
		g.setColor(new Color(246, 163, 61));
		int xShape47[] = {304, 294, 336, 338, 324, 304};
		int yShape47[] = {317, 335, 375, 335, 317, 317};
		g.fillPolygon(new Polygon(xShape47, yShape47, xShape47.length));
		
		g.setColor(new Color(241, 221, 74));
		int xShape48[] = {387, 418, 435, 394};
		int yShape48[] = {344, 335, 356, 365};
		g.fillPolygon(new Polygon(xShape48, yShape48, xShape48.length));
		
		g.setColor(new Color(255, 185, 37));
		int xShape49[] = {418, 446, 458, 435};
		int yShape49[] = {335, 328, 342, 356};
		g.fillPolygon(new Polygon(xShape49, yShape49, xShape49.length));
		
		g.setColor(new Color(229, 220, 39));
		int xShape50[] = {446, 470, 458};
		int yShape50[] = {328, 323, 342};
		g.fillPolygon(new Polygon(xShape50, yShape50, xShape50.length));
		
		g.setColor(new Color(255, 155, 34));
		int xShape51[] = {470, 458, 446, 472, 479};
		int yShape51[] = {323, 342, 379, 375, 344};
		g.fillPolygon(new Polygon(xShape51, yShape51, xShape51.length));
		
		g.setColor(new Color(241, 140, 32));
		int xShape52[] = {435, 458, 446};
		int yShape52[] = {356, 342, 379};
		g.fillPolygon(new Polygon(xShape52, yShape52, xShape52.length));
		
		g.setColor(new Color(245, 162, 32));
		int xShape53[] = {435, 397, 425, 423, 446};
		int yShape53[] = {356, 399, 387, 418, 379};
		g.fillPolygon(new Polygon(xShape53, yShape53, xShape53.length));
		
		g.setColor(new Color(244, 175, 48));
		int xShape54[] = {394, 356, 397, 397, 435};
		int yShape54[] = {365, 390, 382, 399, 356};
		g.fillPolygon(new Polygon(xShape54, yShape54, xShape54.length));
		
		g.setColor(new Color(204, 131, 32));
		int xShape55[] = {425, 397, 377, 423};
		int yShape55[] = {387, 399, 461, 418};
		g.fillPolygon(new Polygon(xShape55, yShape55, xShape55.length));
	
		g.setColor(new Color(182, 121, 38));
		int xShape56[] = {397, 377, 330};
		int yShape56[] = {399, 461, 432};
		g.fillPolygon(new Polygon(xShape56, yShape56, xShape56.length));
		
		g.setColor(new Color(248, 191, 52));
		int xShape57[] = {397, 356, 336, 317, 302, 330, 397, 397};
		int yShape57[] = {382, 390, 395, 400, 426, 432, 399, 382};
		g.fillPolygon(new Polygon(xShape57, yShape57, xShape57.length));
		
		g.setColor(new Color(165, 110, 33));
		int xShape58[] = {330, 377, 350};
		int yShape58[] = {432, 461, 474};
		g.fillPolygon(new Polygon(xShape58, yShape58, xShape58.length));
		
		g.setColor(new Color(134, 104, 34));
		int xShape59[] = {330, 309, 350};
		int yShape59[] = {432, 457, 474};
		g.fillPolygon(new Polygon(xShape59, yShape59, xShape59.length));
		
		g.setColor(new Color(240, 125, 45));
		int xShape60[] = {350, 347, 302};
		int yShape60[] = {474, 539, 496};
		g.fillPolygon(new Polygon(xShape60, yShape60, xShape60.length));
		
		g.setColor(new Color(245, 162, 56));
		int xShape61[] = {309, 350, 302};
		int yShape61[] = {457, 474, 496};
		g.fillPolygon(new Polygon(xShape61, yShape61, xShape61.length));
		
		g.setColor(new Color(251, 145, 33));
		int xShape62[] = {347, 285, 377};
		int yShape62[] = {539, 542, 605};
		g.fillPolygon(new Polygon(xShape62, yShape62, xShape62.length));
		
		g.setColor(new Color(201, 126, 35));
		int xShape63[] = {338, 285, 377};
		int yShape63[] = {638, 542, 605};
		g.fillPolygon(new Polygon(xShape63, yShape63, xShape63.length));
		
		g.setColor(new Color(251, 177, 52));
		int xShape64[] = {302, 285, 347};
		int yShape64[] = {496, 542, 539};
		g.fillPolygon(new Polygon(xShape64, yShape64, xShape64.length));
		
		g.setColor(new Color(204, 137, 46));
		int xShape65[] = {285, 264, 300};
		int yShape65[] = {542, 602, 570};
		g.fillPolygon(new Polygon(xShape65, yShape65, xShape65.length));
		
		g.setColor(new Color(204, 137, 46));
		int xShape66[] = {300, 264, 338};
		int yShape66[] = {570, 602, 638};
		g.fillPolygon(new Polygon(xShape66, yShape66, xShape66.length));
		
		g.setColor(new Color(153, 99, 27));
		int xShape67[] = {264, 265, 338};
		int yShape67[] = {602, 640, 637};
		g.fillPolygon(new Polygon(xShape67, yShape67, xShape67.length));
		
		g.setColor(new Color(236, 130, 52));
		int xShape68[] = {302, 330, 309};
		int yShape68[] = {426, 432, 457};
		g.fillPolygon(new Polygon(xShape68, yShape68, xShape68.length));
		
		g.setColor(new Color(133, 88, 23));
		int xShape69[] = {265, 265, 192};
		int yShape69[] = {602, 640, 628};
		g.fillPolygon(new Polygon(xShape69, yShape69, xShape69.length));
		
		g.setColor(new Color(211, 140, 52));
		int xShape70[] = {190, 177, 192};
		int yShape70[] = {580, 630, 628};
		g.fillPolygon(new Polygon(xShape70, yShape70, xShape70.length));
		
		g.setColor(new Color(205, 141, 51));
		int xShape71[] = {147, 138, 176};
		int yShape71[] = {628, 645, 630};
		g.fillPolygon(new Polygon(xShape71, yShape71, xShape71.length));
		
		g.setColor(new Color(205, 141, 51));
		int xShape72[] = {147, 177, 191};
		int yShape72[] = {628, 630, 580};
		g.fillPolygon(new Polygon(xShape72, yShape72, xShape72.length));
		
		g.setColor(new Color(146, 101, 33));
		int xShape73[] = {147, 138, 115, 100, 130};
		int yShape73[] = {628, 645, 628, 602, 599};
		g.fillPolygon(new Polygon(xShape73, yShape73, xShape73.length));
		
		g.setColor(new Color(246, 159, 76));
		int xShape74[] = {138, 115, 97, 90, 100};
		int yShape74[] = {645, 628, 620, 635, 657};
		g.fillPolygon(new Polygon(xShape74, yShape74, xShape74.length));
		
		g.setColor(new Color(245, 226, 68));
		int xShape75[] = {100, 90, 97, 63, 53};
		int yShape75[] = {657, 635, 620, 631, 653};
		g.fillPolygon(new Polygon(xShape75, yShape75, xShape75.length));
		
		g.setColor(new Color(249, 193, 74));
		int xShape76[] = {97, 76, 115, 130, 100, 115};
		int yShape76[] = {620, 587, 580, 599, 602, 628};
		g.fillPolygon(new Polygon(xShape76, yShape76, xShape76.length));
		
		g.setColor(new Color(234, 236, 101));
		int xShape77[] = {76, 115, 90};
		int yShape77[] = {587, 580, 551};
		g.fillPolygon(new Polygon(xShape77, yShape77, xShape77.length));
		
		g.setColor(new Color(169, 120, 44));
		int xShape78[] = {130, 147, 190};
		int yShape78[] = {599, 628, 580};
		g.fillPolygon(new Polygon(xShape78, yShape78, xShape78.length));
		
		g.setColor(new Color(250, 185, 69));
		int xShape79[] = {130, 174, 190};
		int yShape79[] = {599, 533, 580};
		g.fillPolygon(new Polygon(xShape79, yShape79, xShape79.length));
		
		g.setColor(new Color(251, 202, 71));
		int xShape80[] = {197, 174, 190};
		int yShape80[] = {524, 533, 580};
		g.fillPolygon(new Polygon(xShape80, yShape80, xShape80.length));
		
		g.setColor(new Color(250, 185, 65));
		int xShape81[] = {197, 190, 234};
		int yShape81[] = {524, 580, 551};
		g.fillPolygon(new Polygon(xShape81, yShape81, xShape81.length));
		
		g.setColor(new Color(249, 200, 9));
		int xShape82[] = {197, 234, 229};
		int yShape82[] = {524, 551, 502};
		g.fillPolygon(new Polygon(xShape82, yShape82, xShape82.length));
		
		g.setColor(new Color(240, 238, 65));
		int xShape83[] = {234, 229, 285,};
		int yShape83[] = {551, 502, 542};
		g.fillPolygon(new Polygon(xShape83, yShape83, xShape83.length));
		
		g.setColor(new Color(242, 210, 63));
		int xShape84[] = {229, 285, 269};
		int yShape84[] = {502, 542, 492};
		g.fillPolygon(new Polygon(xShape84, yShape84, xShape84.length));
		
		g.setColor(new Color(253, 161, 60));
		int xShape85[] = {285, 269, 302};
		int yShape85[] = {542, 492, 496};
		g.fillPolygon(new Polygon(xShape85, yShape85, xShape85.length));
		
		g.setColor(new Color(192, 131, 40));
		int xShape86[] = {285, 234, 264};
		int yShape86[] = {542, 551, 602};
		g.fillPolygon(new Polygon(xShape86, yShape86, xShape86.length));
		
		g.setColor(new Color(166, 115, 36));
		int xShape87[] = {234, 264, 192};
		int yShape87[] = {551, 602, 628};
		g.fillPolygon(new Polygon(xShape87, yShape87, xShape87.length));
		
		g.setColor(new Color(189, 133, 50));
		int xShape88[] = {234, 190, 192};
		int yShape88[] = {551, 580, 628};
		g.fillPolygon(new Polygon(xShape88, yShape88, xShape88.length));
		
		g.setColor(new Color(245, 136, 41));
		int xShape89[] = {335, 378, 378, 341, 350, 306, 287};
		int yShape89[] = {623, 634, 650, 638, 666, 656, 639};
		g.fillPolygon(new Polygon(xShape89, yShape89, xShape89.length));
		
		g.setColor(new Color(222, 210, 40));
		int xShape90[] = {378, 378, 415, 406};
		int yShape90[] = {634, 650, 669, 646};
		g.fillPolygon(new Polygon(xShape90, yShape90, xShape90.length));
		
		g.setColor(new Color(247, 166, 35));
		int xShape91[] = {341, 378, 415, 383, 350};
		int yShape91[] = {638, 650, 669, 671, 666};
		g.fillPolygon(new Polygon(xShape91, yShape91, xShape91.length));
		
		g.setColor(new Color(77, 29, 23));
		int xShape92[] = {347, 348, 370, 383, 388, 388, 377, 381, 358};
		int yShape92[] = {539, 532, 542, 518, 536, 548, 553, 559, 562};
		g.fillPolygon(new Polygon(xShape92, yShape92, xShape92.length));
		
		g.setColor(new Color(106, 39, 22));
		int xShape93[] = {358, 381, 377, 388, 388, 398, 406, 398, 362};
		int yShape93[] = {562, 559, 553, 548, 536, 520, 545, 570, 569};
		g.fillPolygon(new Polygon(xShape93, yShape93, xShape93.length));
		
		g.setColor(new Color(222, 116, 58));
		int xShape94[] = {383, 400, 398, 388};
		int yShape94[] = {518, 494, 520, 536};
		g.fillPolygon(new Polygon(xShape94, yShape94, xShape94.length));
		
		g.setColor(new Color(234, 229, 65));
		int xShape95[] = {400, 398, 416};
		int yShape95[] = {494, 520, 512};
		g.fillPolygon(new Polygon(xShape95, yShape95, xShape95.length));
		
		g.setColor(new Color(240, 221, 74));
		int xShape96[] = {373, 368, 400};
		int yShape96[] = {536, 494, 494};
		g.fillPolygon(new Polygon(xShape96, yShape96, xShape96.length));
		
		g.setColor(new Color(205, 124, 43));
		int xShape97[] = {398, 416, 434, 406};
		int yShape97[] = {520, 512, 536, 545};
		g.fillPolygon(new Polygon(xShape97, yShape97, xShape97.length));
		
		g.setColor(new Color(205, 124, 43));
		int xShape98[] = {398, 416, 434, 406};
		int yShape98[] = {520, 512, 536, 545};
		g.fillPolygon(new Polygon(xShape98, yShape98, xShape98.length));
		
		g.setColor(new Color(239, 122, 14));
		int xShape99[] = {400, 413, 437};
		int yShape99[] = {494, 474, 485};
		g.fillPolygon(new Polygon(xShape99, yShape99, xShape99.length));
		
		g.setColor(new Color(250, 188, 51));
		int xShape100[] = {400, 437, 416};
		int yShape100[] = {494, 485, 512};
		g.fillPolygon(new Polygon(xShape100, yShape100, xShape100.length));
		
		g.setColor(new Color(160, 93, 9));
		int xShape101[] = {416, 437, 453, 434};
		int yShape101[] = {512, 485, 507, 536};
		g.fillPolygon(new Polygon(xShape101, yShape101, xShape101.length));
		
		g.setColor(new Color(237, 177, 57));
		int xShape102[] = {413, 434, 437};
		int yShape102[] = {474, 434, 485};
		g.fillPolygon(new Polygon(xShape102, yShape102, xShape102.length));
		
		g.setColor(new Color(198, 120, 40));
		int xShape103[] = {437, 434, 476, 454};
		int yShape103[] = {485, 434, 482, 507};
		g.fillPolygon(new Polygon(xShape103, yShape103, xShape103.length));
		
		g.setColor(new Color(233, 231, 61));
		int xShape104[] = {434, 466, 463};
		int yShape104[] = {434, 422, 467};
		g.fillPolygon(new Polygon(xShape104, yShape104, xShape104.length));
		
		g.setColor(new Color(241, 177, 20));
		int xShape105[] = {434, 463, 466};
		int yShape105[] = {434, 394, 422};
		g.fillPolygon(new Polygon(xShape105, yShape105, xShape105.length));
		
		g.setColor(new Color(245, 223, 41));
		int xShape106[] = {463, 545, 466};
		int yShape106[] = {394, 379, 422};
		g.fillPolygon(new Polygon(xShape106, yShape106, xShape106.length));
		
		g.setColor(new Color(238, 229, 66));
		int xShape107[] = {532, 545, 466};
		int yShape107[] = {410, 379, 422};
		g.fillPolygon(new Polygon(xShape107, yShape107, xShape107.length));
		
		g.setColor(new Color(241, 222, 31));
		int xShape108[] = {532, 545, 584};
		int yShape108[] = {410, 379, 410};
		g.fillPolygon(new Polygon(xShape108, yShape108, xShape108.length));
		
		g.setColor(new Color(237, 230, 62));
		int xShape109[] = {620, 545, 584};
		int yShape109[] = {391, 379, 410};
		g.fillPolygon(new Polygon(xShape109, yShape109, xShape109.length));
		
		g.setColor(new Color(240, 164, 26));
		int xShape110[] = {620, 584, 548, 601};
		int yShape110[] = {391, 410, 453, 432};
		g.fillPolygon(new Polygon(xShape110, yShape110, xShape110.length));
		
		g.setColor(new Color(232, 227, 39));
		int xShape111[] = {620, 601, 685};
		int yShape111[] = {391, 432, 410};
		g.fillPolygon(new Polygon(xShape111, yShape111, xShape111.length));
		
		g.setColor(new Color(191, 118, 26));
		int xShape112[] = {584, 575, 601, 685};
		int yShape112[] = {511, 511, 432, 410};
		g.fillPolygon(new Polygon(xShape112, yShape112, xShape112.length));
		
		g.setColor(new Color(171, 101, 31));
		int xShape113[] = {548, 575, 601};
		int yShape113[] = {453, 511, 432};
		g.fillPolygon(new Polygon(xShape113, yShape113, xShape113.length));
		
		g.setColor(new Color(143, 88, 15));
		int xShape114[] = {548, 575, 505};
		int yShape114[] = {453, 511, 488};
		g.fillPolygon(new Polygon(xShape114, yShape114, xShape114.length));
		
		g.setColor(new Color(121, 71, 14));
		int xShape115[] = {548, 491, 505};
		int yShape115[] = {453, 456, 488};
		g.fillPolygon(new Polygon(xShape115, yShape115, xShape115.length));
		
		g.setColor(new Color(156, 86, 15));
		int xShape116[] = {476, 491, 505};
		int yShape116[] = {482, 456, 488};
		g.fillPolygon(new Polygon(xShape116, yShape116, xShape116.length));
		
		g.setColor(new Color(156, 86, 15));
		int xShape117[] = {476, 491, 505};
		int yShape117[] = {482, 456, 488};
		g.fillPolygon(new Polygon(xShape117, yShape117, xShape117.length));
		
		g.setColor(new Color(173, 103, 34));
		int xShape118[] = {476, 491, 463};
		int yShape118[] = {482, 456, 467};
		g.fillPolygon(new Polygon(xShape118, yShape118, xShape118.length));
		
		g.setColor(new Color(149, 91, 41));
		int xShape119[] = {466, 491, 463};
		int yShape119[] = {422, 456, 467};
		g.fillPolygon(new Polygon(xShape119, yShape119, xShape119.length));
		
		g.setColor(new Color(253, 185, 40));
		int xShape120[] = {466, 491, 532};
		int yShape120[] = {422, 456, 410};
		g.fillPolygon(new Polygon(xShape120, yShape120, xShape120.length));
		
		g.setColor(new Color(240, 108, 36));
		int xShape121[] = {548, 491, 532};
		int yShape121[] = {453, 456, 410};
		g.fillPolygon(new Polygon(xShape121, yShape121, xShape121.length));
		
		g.setColor(new Color(248, 134, 35));
		int xShape122[] = {548, 584, 532};
		int yShape122[] = {453, 410, 410};
		g.fillPolygon(new Polygon(xShape122, yShape122, xShape122.length));
		
		//ito ay ears sa right
		g.setColor(new Color(197, 134, 55));
		int xShape123[] = {371, 432, 419};
		int yShape123[] = {202, 167, 216};
		g.fillPolygon(new Polygon(xShape123, yShape123, xShape123.length));
		
		g.setColor(new Color(198, 126, 45));
		int xShape124[] = {371, 393, 419};
		int yShape124[] = {202, 236, 216};
		g.fillPolygon(new Polygon(xShape124, yShape124, xShape124.length));
		
		g.setColor(new Color(246, 182, 79));
		int xShape125[] = {371, 371, 382, 416, 432};
		int yShape125[] = {202, 183, 186, 134, 167};
		g.fillPolygon(new Polygon(xShape125, yShape125, xShape125.length));
		
		g.setColor(new Color(242, 176, 56));
		int xShape126[] = {371, 382, 416, 368};
		int yShape126[] = {183, 186, 134, 148};
		g.fillPolygon(new Polygon(xShape126, yShape126, xShape126.length));
		
		g.setColor(new Color(244, 187, 48));
		int xShape127[] = {382, 416, 368};
		int yShape127[] = {95, 134, 148};
		g.fillPolygon(new Polygon(xShape127, yShape127, xShape127.length));
		
		g.setColor(new Color(246, 148, 57));
		int xShape128[] = {382, 416, 416};
		int yShape128[] = {95, 134, 99};
		g.fillPolygon(new Polygon(xShape128, yShape128, xShape128.length));
		
		g.setColor(new Color(250, 222, 52));
		int xShape129[] = {382, 392, 416};
		int yShape129[] = {95, 77, 99};
		g.fillPolygon(new Polygon(xShape129, yShape129, xShape129.length));
		
		g.setColor(new Color(244, 121, 54));
		int xShape130[] = {441, 416, 416};
		int yShape130[] = {126, 134, 99};
		g.fillPolygon(new Polygon(xShape130, yShape130, xShape130.length));
		
		g.setColor(new Color(245, 146, 45));
		int xShape131[] = {432, 416, 441};
		int yShape131[] = {167, 134, 126};
		g.fillPolygon(new Polygon(xShape131, yShape131, xShape131.length));
		
		g.setColor(new Color(14, 15, 27));
		int xShape132[] = {392, 433, 416};
		int yShape132[] = {77, 27, 99};
		g.fillPolygon(new Polygon(xShape132, yShape132, xShape132.length));
		
		g.setColor(new Color(21, 21, 21));
		int xShape134[] = {444, 444, 416, 433};
		int yShape134[] = {79, 95, 99, 27};
		g.fillPolygon(new Polygon(xShape134, yShape134, xShape134.length));
		
		g.setColor(new Color(30, 28, 31));
		int xShape135[] = {441, 444, 416};
		int yShape135[] = {126, 95, 99};
		g.fillPolygon(new Polygon(xShape135, yShape135, xShape135.length));
		
		
		//continuation of body
		
		g.setColor(new Color(248, 229, 65));
		int xShape136[] = {174, 130, 114};
		int yShape136[] = {533, 599, 580};
		g.fillPolygon(new Polygon(xShape136, yShape136, xShape136.length));
		
		g.setColor(new Color(254, 201, 69));
		int xShape137[] = {174, 101, 114};
		int yShape137[] = {533, 564, 580};
		g.fillPolygon(new Polygon(xShape137, yShape137, xShape137.length));
		
		g.setColor(new Color(243, 231, 67));
		int xShape138[] = {174, 101, 90};
		int yShape138[] = {533, 564, 551};
		g.fillPolygon(new Polygon(xShape138, yShape138, xShape138.length));
		
		g.setColor(new Color(255, 255, 175));
		int xShape139[] = {109, 127, 90};
		int yShape139[] = {483, 543, 551};
		g.fillPolygon(new Polygon(xShape139, yShape139, xShape139.length));
		
		g.setColor(new Color(238, 240, 107));
		int xShape140[] = {118, 127, 174};
		int yShape140[] = {513, 543, 533};
		g.fillPolygon(new Polygon(xShape140, yShape140, xShape140.length));
		
		g.setColor(new Color(246, 237, 74));
		int xShape141[] = {118, 141, 174};
		int yShape141[] = {513, 494, 533};
		g.fillPolygon(new Polygon(xShape141, yShape141, xShape141.length));
		
		g.setColor(new Color(250, 202, 77));
		int xShape142[] = {193, 141, 174};
		int yShape142[] = {476, 494, 533};
		g.fillPolygon(new Polygon(xShape142, yShape142, xShape142.length));
		
		g.setColor(new Color(247, 176, 70));
		int xShape143[] = {193, 196, 174};
		int yShape143[] = {476, 525, 533};
		g.fillPolygon(new Polygon(xShape143, yShape143, xShape143.length));
		
		g.setColor(new Color(253, 186, 70));
		int xShape144[] = {193, 196, 229};
		int yShape144[] = {476, 525, 502};
		g.fillPolygon(new Polygon(xShape144, yShape144, xShape144.length));
		
		g.setColor(new Color(248, 212, 66));
		int xShape145[] = {193, 302, 229};
		int yShape145[] = {476, 426, 502};
		g.fillPolygon(new Polygon(xShape145, yShape145, xShape145.length));
		
		g.setColor(new Color(247, 185, 62));
		int xShape146[] = {229, 302, 269};
		int yShape146[] = {502, 426, 492};
		g.fillPolygon(new Polygon(xShape146, yShape146, xShape146.length));
		
		g.setColor(new Color(247, 195, 62));
		int xShape147[] = {309, 302, 269};
		int yShape147[] = {457, 426, 492};
		g.fillPolygon(new Polygon(xShape147, yShape147, xShape147.length));
		
		g.setColor(new Color(247, 195, 62));
		int xShape148[] = {309, 302, 269};
		int yShape148[] = {457, 496, 492};
		g.fillPolygon(new Polygon(xShape148, yShape148, xShape148.length));
		
		g.setColor(new Color(239, 238, 68));
		int xShape149[] = {193, 219, 302};
		int yShape149[] = {476, 438, 426};
		g.fillPolygon(new Polygon(xShape149, yShape149, xShape149.length));
		
		g.setColor(new Color(250, 206, 73));
		int xShape150[] = {241, 219, 271};
		int yShape150[] = {410, 438, 431};
		g.fillPolygon(new Polygon(xShape150, yShape150, xShape150.length));
		
		g.setColor(new Color(208, 148, 62));
		int xShape151[] = {317, 302, 271, 241};
		int yShape151[] = {400, 426, 431, 410};
		g.fillPolygon(new Polygon(xShape151, yShape151, xShape151.length));
		
		g.setColor(new Color(250, 195, 68));
		int xShape152[] = {282, 336, 317, 241};
		int yShape152[] = {378, 375, 400, 410};
		g.fillPolygon(new Polygon(xShape152, yShape152, xShape152.length));
		
		g.setColor(new Color(250, 195, 68));
		int xShape153[] = {282, 336, 294, 273};
		int yShape153[] = {378, 375, 335, 362};
		g.fillPolygon(new Polygon(xShape153, yShape153, xShape153.length));
		
		g.setColor(new Color(248, 243, 87));
		int xShape154[] = {246, 282, 273};
		int yShape154[] = {378, 378, 362};
		g.fillPolygon(new Polygon(xShape154, yShape154, xShape154.length));
		
		g.setColor(new Color(248, 243, 87));
		int xShape155[] = {246, 282, 241, 241};
		int yShape155[] = {378, 378, 410, 379};
		g.fillPolygon(new Polygon(xShape155, yShape155, xShape155.length));
		
		g.setColor(new Color(252, 203, 82));
		int xShape156[] = {222, 222, 241, 241, 213, 182};
		int yShape156[] = {324, 356, 379, 391, 391, 339};
		g.fillPolygon(new Polygon(xShape156, yShape156, xShape156.length));
		
		g.setColor(new Color(247, 233, 84));
		int xShape157[] = {222, 182, 143, 167};
		int yShape157[] = {324, 339, 337, 324};
		g.fillPolygon(new Polygon(xShape157, yShape157, xShape157.length));
		
		g.setColor(new Color(239, 222, 90));
		int xShape158[] = {182, 143, 176, 213};
		int yShape158[] = {339, 337, 372, 391};
		g.fillPolygon(new Polygon(xShape158, yShape158, xShape158.length));
		
		g.setColor(new Color(253, 227, 82));
		int xShape159[] = {213, 223, 230};
		int yShape159[] = {391, 410, 391};
		g.fillPolygon(new Polygon(xShape159, yShape159, xShape159.length));
		
		g.setColor(new Color(242, 154, 67));
		int xShape160[] = {241, 241, 223, 230};
		int yShape160[] = {391, 410, 410, 391};
		g.fillPolygon(new Polygon(xShape160, yShape160, xShape160.length));
		
		g.setColor(new Color(197, 147, 60));
		int xShape161[] = {241, 223, 212, 219};
		int yShape161[] = {410, 410, 433, 438};
		g.fillPolygon(new Polygon(xShape161, yShape161, xShape161.length));
		
		g.setColor(new Color(252, 193, 75));
		int xShape162[] = {213, 176, 191, 191, 223};
		int yShape162[] = {391, 372, 388, 414, 410};
		g.fillPolygon(new Polygon(xShape162, yShape162, xShape162.length));
		
		g.setColor(new Color(255, 194, 78));
		int xShape163[] = {176, 191, 149, 113};
		int yShape163[] = {372, 388, 390, 370};
		g.fillPolygon(new Polygon(xShape163, yShape163, xShape163.length));
		
		g.setColor(new Color(245, 243, 81));
		int xShape164[] = {78, 149, 113};
		int yShape164[] = {390, 390, 370};
		g.fillPolygon(new Polygon(xShape164, yShape164, xShape164.length));
		
		g.setColor(new Color(253, 209, 76));
		int xShape165[] = {78, 149, 78};
		int yShape165[] = {390, 390, 430};
		g.fillPolygon(new Polygon(xShape165, yShape165, xShape165.length));
		
		g.setColor(new Color(220, 170, 97));
		int xShape166[] = {78, 149, 191, 118};
		int yShape166[] = {430, 390, 388, 447};
		g.fillPolygon(new Polygon(xShape166, yShape166, xShape166.length));
		
		g.setColor(new Color(247, 176, 70));
		int xShape167[] = {191, 191, 139};
		int yShape167[] = {388, 414, 429};
		g.fillPolygon(new Polygon(xShape167, yShape167, xShape167.length));
		
		g.setColor(new Color(196, 154, 46));
		int xShape168[] = {187, 118, 139};
		int yShape168[] = {447, 447, 429};
		g.fillPolygon(new Polygon(xShape168, yShape168, xShape168.length));
		
		g.setColor(new Color(161, 123, 50));
		int xShape169[] = {187, 191, 139};
		int yShape169[] = {447, 414, 429};
		g.fillPolygon(new Polygon(xShape169, yShape169, xShape169.length));
		
		g.setColor(new Color(184, 131, 55));
		int xShape170[] = {187, 191, 223, 212};
		int yShape170[] = {447, 414, 410, 433};
		g.fillPolygon(new Polygon(xShape170, yShape170, xShape170.length));
		
		g.setColor(new Color(252, 202, 71));
		int xShape171[] = {187, 212, 219, 193, 164};
		int yShape171[] = {447, 433, 438, 476, 447};
		g.fillPolygon(new Polygon(xShape171, yShape171, xShape171.length));
		
		g.setColor(new Color(247, 237, 113));
		int xShape172[] = {145, 193, 164};
		int yShape172[] = {474, 476, 447};
		g.fillPolygon(new Polygon(xShape172, yShape172, xShape172.length));
		
		g.setColor(new Color(245, 232, 78));
		int xShape173[] = {145, 193, 141};
		int yShape173[] = {474, 476, 494};
		g.fillPolygon(new Polygon(xShape173, yShape173, xShape173.length));
		
		g.setColor(new Color(246, 204, 70));
		int xShape174[] = {145, 111, 141};
		int yShape174[] = {474, 472, 494};
		g.fillPolygon(new Polygon(xShape174, yShape174, xShape174.length));
		
		g.setColor(new Color(242, 237, 107));
		int xShape175[] = {111, 141, 118, 109};
		int yShape175[] = {472, 494, 513, 483};
		g.fillPolygon(new Polygon(xShape175, yShape175, xShape175.length));
		
		g.setColor(new Color(251, 239, 91));
		int xShape176[] = {111, 145, 164, 131};
		int yShape176[] = {472, 474, 447, 447};
		g.fillPolygon(new Polygon(xShape176, yShape176, xShape176.length));
		
		g.setColor(new Color(224, 151, 46));
		int xShape177[] = {222, 222, 201};
		int yShape177[] = {303, 324, 299};
		g.fillPolygon(new Polygon(xShape177, yShape177, xShape177.length));
		
		g.setColor(new Color(248, 211, 71));
		int xShape178[] = {222, 201, 187, 176, 185, 167};
		int yShape178[] = {324, 299, 290, 291, 303, 324};
		g.fillPolygon(new Polygon(xShape178, yShape178, xShape178.length));
		
		g.setColor(new Color(220, 87, 52));
		int xShape179[] = {176, 185, 167, 143, 143, 158};
		int yShape179[] = {291, 303, 324, 337, 290, 262,};
		g.fillPolygon(new Polygon(xShape179, yShape179, xShape179.length));
		
		g.setColor(new Color(193, 61, 49));
		int xShape180[] = {120, 143, 143, 158};
		int yShape180[] = {290, 337, 290, 262,};
		g.fillPolygon(new Polygon(xShape180, yShape180, xShape180.length));
		
		g.setColor(new Color(250, 246, 159));
		int xShape181[] = {189, 185, 200, 179, 158};
		int yShape181[] = {262, 244, 226, 207, 262};
		g.fillPolygon(new Polygon(xShape181, yShape181, xShape181.length));
		
		g.setColor(new Color(244, 241, 78));
		int xShape182[] = {176, 187, 189, 158};
		int yShape182[] = {291, 290, 262, 262,};
		g.fillPolygon(new Polygon(xShape182, yShape182, xShape182.length));
		
		g.setColor(new Color(238, 201, 61));
		int xShape183[] = {203, 211, 225, 201, 187, 189};
		int yShape183[] = {271, 271, 284, 299, 290, 262};
		g.fillPolygon(new Polygon(xShape183, yShape183, xShape183.length));
		
		g.setColor(new Color(31, 31, 28));
		int xShape184[] = {185, 198, 225, 205, 225, 211, 203, 189};
		int yShape184[] = {244, 228, 229, 247, 267, 271, 271, 262};
		g.fillPolygon(new Polygon(xShape184, yShape184, xShape184.length));
		
		g.setColor(new Color(255, 185, 74));
		int xShape185[] = {199, 225, 242, 217};
		int yShape185[] = {227, 229, 199, 209};
		g.fillPolygon(new Polygon(xShape185, yShape185, xShape185.length));
		
		g.setColor(new Color(238, 239, 243));
		int xShape186[] = {225, 205, 225, 235};
		int yShape186[] = {267, 247, 229, 247};
		g.fillPolygon(new Polygon(xShape186, yShape186, xShape186.length));
		
		g.setColor(new Color(255, 236, 108));
		int xShape187[] = {211, 222, 239, 248, 225};
		int yShape187[] = {271, 267, 271, 280, 284};
		g.fillPolygon(new Polygon(xShape187, yShape187, xShape187.length));
		
		g.setColor(new Color(247, 172, 71));
		int xShape188[] = {222, 225, 201};
		int yShape188[] = {303, 284, 299};
		g.fillPolygon(new Polygon(xShape188, yShape188, xShape188.length));
		
		g.setColor(new Color(246, 208, 73));
		int xShape189[] = {222, 225, 248, 265, 274, 242};
		int yShape189[] = {303, 284, 280, 291, 293, 304};
		g.fillPolygon(new Polygon(xShape189, yShape189, xShape189.length));
		
		g.setColor(new Color(255, 195, 69));
		int xShape190[] = {225, 235, 239, 265, 242};
		int yShape190[] = {229, 247, 255, 235, 199};
		g.fillPolygon(new Polygon(xShape190, yShape190, xShape190.length));
		
		g.setColor(new Color(244, 172, 61));
		int xShape191[] = {235, 239, 250, 261, 274, 265, 248, 239, 222};
		int yShape191[] = {247, 255, 271, 270, 293, 291, 280, 271, 267};
		g.fillPolygon(new Polygon(xShape191, yShape191, xShape191.length));
		
		g.setColor(new Color(136, 49, 57));
		int xShape192[] = {222, 254, 261, 294, 304, 292, 274, 242, 222};
		int yShape192[] = {324, 310, 310, 335, 317, 310, 293, 304, 303};
		g.fillPolygon(new Polygon(xShape192, yShape192, xShape192.length));
		
		g.setColor(new Color(229, 149, 125));
		int xShape193[] = {222, 261, 222};
		int yShape193[] = {324, 336, 356};
		g.fillPolygon(new Polygon(xShape193, yShape193, xShape193.length));
		
		g.setColor(new Color(217, 98, 94));
		int xShape194[] = {222, 261, 222, 241, 246, 273, 294, 261, 254, 222};
		int yShape194[] = {324, 336, 356, 379, 378, 362, 335, 310, 310, 324};
		g.fillPolygon(new Polygon(xShape194, yShape194, xShape194.length));
		
	}
}