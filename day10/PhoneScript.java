public class PhoneScript {

public static void main(String[] args) {

Phone myphone = new OldPhone();
myphone.call("858 344 2568");
MobilePhone mobile = new MobilePhone();
mobile.call("00 456 5453");
mobile.call("347 456 5454");
mobile.call("347 456 5455");
mobile.call("347 456 5456");
mobile.call("347 456 5457");
mobile.call("347 456 5458");
mobile.call("347 456 5459");
mobile.call("347 456 5410");
mobile.call("347 456 5411");
mobile.call("347 456 5412");
mobile.call("347 456 5413");
mobile.ringAlarm("DaisyChains");
mobile.printLastNumbers();
}
}