package com.overjay;

public class EnvConditions {

    //this is internal moisture content, percent, should be set outside for calculations in this object
    int instanceIntAirMoisture = 50;



    //water steam pressure should be calculated individually for each calculation instance each time
    //based on the special table I will need to somehow import from respective building code
    //the table should be an external file, so it can be amended either by this program, or by hand externally
    //For the initial test version this hardcoded array will be used.
    //same with the environmental conditions for country area, I should write a python script to extract that shit
    //WARNING - the second element in each pair is actually calculated value, should be filled with loop using data
    // from this object. loop should be in a constructor I guess. Formulas (6) and (7) from DSTU-N B V.2.6.-192
    int[][] instanceSteamPressure = {{412,342},{452,357}, {657,486},
                                    {1148,758}, {1729,1072}, {2105,1431},
                                    {2310,1594},{2197,1494},{1588,1175},
                                    {1081,832},{700,588},{496,422}};

    //these are temperature and relative moisture content. Temp is Celsius, moisture is percent.
    //first array index is month number, second is either 0 for temp or 1 for moisture.
    //grouped by threes for convenience, these will have to be changed into variables eventually
    //variables will be filled upon constructing this class' object from external table. Same idea as above.

    float[][] instanceEnvironmentVar = {{-4.7f,0.83f},{-3.6f, 0.79f}, {1f, 0.74f},
                      {9f,66f}, {15.2f, 62f}, {18.3f, 68f},
                      {19.8f,69f},{19f,68f},{13.9f,74f},
                      {8.1f, 77f},{1.9f,84f},{-2.5f,85f}};

    // pressure of internal saturated water steam, marked as E-value, Pascals
    //this one is taken from the table with internal air conditions
    int instanceIntAirSatE = 2340;

    //instance internal air partial moisture pressure
    int instanceIntAirPartPress = instanceIntAirSatE * instanceIntAirMoisture / 100;


}
