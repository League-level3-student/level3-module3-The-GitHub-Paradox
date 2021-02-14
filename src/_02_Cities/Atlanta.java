package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return super.getPopulation()*super.getGrowthRate()*(super.getGrowthRate()*2);
	}

}
