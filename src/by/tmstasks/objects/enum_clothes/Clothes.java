package by.tmstasks.objects.enum_clothes;

public abstract class Clothes implements Mans_Clothing,Women_Clothing{
    private int clothesSize;
    private int clothesPrise;
    private String clothesColor;

    public int getClothesSize() {
        return clothesSize;
    }

    public int getClothesPrise() {
        return clothesPrise;
    }

    public String getClothesColor() {
        return clothesColor;
    }

    public Clothes(int clothesSize, int clothesPrise, String clothesColor) {
        this.clothesSize = clothesSize;
        this.clothesPrise = clothesPrise;
        this.clothesColor = clothesColor;
    }

    @Override
    public String toPutOnClothesOnMan() {
        return null;
    }

    @Override
    public String toPutOnClothingOnWoman() {
        return null;
    }
}
