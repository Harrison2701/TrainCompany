public class TrainCompany
{
    private String companyName;
    private String companyCode;
    private int numberOfJourneys;
    private Journey[] journeyHistory = new Journey[100000];

    public TrainCompany(String x, String y) {
        this.companyName = x;
        this.companyCode = y;
        this.numberOfJourneys = 0;
    }

    public TrainCompany(){}

    // accessor and mutator methods
    Journey getJourney(int x) {
        return journeyHistory[x];
    }

    public void addJourney(Journey j) {
        journeyHistory[numberOfJourneys] = j;
        numberOfJourneys++;
    }

    public double averageDelay() {//code missing
        int sum = 0;
        for(int i=0;i<numberOfJourneys;i++){
            if(journeyHistory[i].getWeatherRelated() == false){
                sum+=journeyHistory[i].getDelay();
            }
        }
        return sum/numberOfJourneys;
    }

    // returns the average delay for all of a company’s journeys
    public String longestDelay(Codes[] c) {
        int num = 0;
        String longDelay = journeyHistory[0].getRouteCode();
        String name;
        for(int i=0;i<numberOfJourneys;i++){
            if(journeyHistory[i].getDelay() > journeyHistory[i-1].getDelay()){
                num = journeyHistory[i].getDelay();
                longDelay = journeyHistory[i].getRouteCode();
            }
        }
        for(int j = 0; j<c.length;j++){
            if(c[j].getRouteCode().equals(longDelay)){
                name = c[j].getRouteName();
            }
        }
        return longDelay;
    }

    // returns the route name for the journey with the longest delay
    public String toString(Codes[] c) {
            return companyName + ": Average Delay = " + averageDelay() + ": Longest Delay =" + longestDelay(c);
    }

}

