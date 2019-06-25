package music;

public class button {

    public static void main(String args[]) throws InterruptedException {

        System.out.println(" GPIO Listening has started.");

        final GpioController gpio = GpioFactory.getInstance();

        GpioPinListenerDigital listener  = new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                System.out.println(" GPIO PIN : " + event.getPin() + "--> GPIO PIN STATE: " + event.getState());
            }
        };

        GpioPinDigitalInput[] pins = {
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, PinPullResistance.PULL_DOWN),// Nota Do
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN),// Nota Re
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN),// Nota Mi
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, PinPullResistance.PULL_DOWN),// Nota Fa
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_12, PinPullResistance.PULL_DOWN),// Nota Sol
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_13, PinPullResistance.PULL_DOWN),// Nota La
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_14, PinPullResistance.PULL_DOWN),// Nota Si
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_01, PinPullResistance.PULL_DOWN),// Nota 1 estendida
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_04, PinPullResistance.PULL_DOWN),// Nota 2 estendida
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_05, PinPullResistance.PULL_DOWN),// Instrumento 1
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_06, PinPullResistance.PULL_DOWN),// Instrumento 2
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_08, PinPullResistance.PULL_DOWN),// Instrumento 3
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_15, PinPullResistance.PULL_DOWN),// Potenciometro Volume
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_16, PinPullResistance.PULL_DOWN),// Slider Timbre
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_10, PinPullResistance.PULL_DOWN)// Slider Oitavas

        };

        gpio.addListener(listener, pins);

        while(true) {
            Thread.sleep(500);
        }

    }
	
}
