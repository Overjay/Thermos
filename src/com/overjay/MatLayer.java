package com.overjay;


public class MatLayer {
    public float thickness; //unit - 'meters'
    public float density; //unit - 'kg/m3'
    public float thermCond; //unit - 'W/m*K'
    public float thermResist; //unit - 'm2*K/W'
    public float steamPerm; //unit - mu - 'mg/(m*hour*Pa)
    public float steamResist; //unit - Re - '(m2*hour*Pa)/mg'
    public int posNumber; //position in the order of addition from inside to outside

//constructor below
    public MatLayer(float thickness, float density, float thermCond, float steamPerm, int posNumber){
        this.thickness = thickness;
        this.density = density;
        this.thermCond = thermCond;
        this.steamPerm = steamPerm;
        this.posNumber = posNumber;
        this.thermResist = thickness/thermCond;
        this.steamResist = float layerSteamResist;

}}