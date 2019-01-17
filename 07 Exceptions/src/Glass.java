public class Glass {

    float maxGallons;
    float currentGallons;

    Glass(float maxGallons){
        this.maxGallons = maxGallons;
    }

    public void addWater(float gallonsToAdd) throws GlassOverflownException{
        float postWater = currentGallons += gallonsToAdd;

        if (postWater > maxGallons) {
            float excessWater = postWater - maxGallons;
            throw new GlassOverflownException("Glass capacity exceeded; you have spilt " + excessWater +" gallons.");
        }

        else {
            currentGallons += gallonsToAdd;
        }
    }

}
