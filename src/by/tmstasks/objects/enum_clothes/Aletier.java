package by.tmstasks.objects.enum_clothes;



public class Aletier {

    public void toPutOnClothesOnMan(Clothes[] clothes) {
        for (Clothes clothes1 : clothes) {
            if (clothes1.toPutOnClothesOnMan() != null) {
                System.out.println(clothes1.toPutOnClothesOnMan());
            }
        }
    }

        public void toPutOnClothingOnWoman(Clothes[] clothes){
            for (Clothes clothes1 : clothes) {
                if (clothes1.toPutOnClothingOnWoman() != null) {
                    System.out.println(clothes1.toPutOnClothingOnWoman());
                }
            }
        }
    }

