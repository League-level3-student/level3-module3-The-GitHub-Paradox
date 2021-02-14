package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		
	}

	@Override
	double getAnnualTaxes() {
		return super.getGrowthRate()*super.getPopulation()+1000000;
	}
}
