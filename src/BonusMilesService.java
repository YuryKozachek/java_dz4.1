public class BonusMilesService {
    public int calculate(int cost) {
        int sumRub = 20;
        int sumMile = cost / sumRub;
        return sumMile;
    }

}
