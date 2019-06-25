
#include <CapacitiveSensor.h>

//int pinoled = 3;  
int pinopot = A0;   
int valorpot = 0;
int pinout1=3;
int pinout2=4;
int pinout3=5;

CapacitiveSensor   cs_2_3 = CapacitiveSensor(2,3);  

float luminosidade = 0; //Valor de luminosidade do led

void setup()
{
  Serial.begin(9600);   

  pinMode(pinout1, OUTPUT);
  pinMode(pinout2, OUTPUT);  
  pinMode(pinout3, OUTPUT); 
  pinMode(pinopot, INPUT);   
}

void loop()
{
 valorpot = analogRead(pinopot);
  long start = millis();

 valor = map(valorpot, 0, 1023, 0, 3);
 long total1 =  cs_2_3.capacitiveSensor(300);


  if(total1>100){
   Serial.println("botao de papel");
 }

else if(valor==2){
   Serial.println("OITAVA 2");
  digitalWrite(pinout2, HIGH);   
 }
else if(valor==1){
   Serial.println("OITAVA 1");
   digitalWrite(pinout1, HIGH); 
 }
else if(valor==3){
   Serial.println("OITAVA 3");
   digitalWrite(pinout3, HIGH); 
 } 
}