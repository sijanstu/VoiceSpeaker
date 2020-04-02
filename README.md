Text To Voice Converter
objective: to convert given text into voice in windows.
usage:
Voicespeaker object =new Voicespeaker(string);
Change file path to desired place editing source code below if D:\\ drive is not suitable.
#Source code:
class Voicespeaker
    {
        String gender="0";
        int reset=0;
        Voicespeaker(String vv){
            if(zira.isSelected())
            {
                gender="1";
            }
            
            if(vv.equals("what is computer"))
            {
                vv="it's me, haha joking. computer is a electronic device which processes given input and gives you final output.";
            
            }
            if(vv.equals("reset -ttv"))
            {
                reset=1;
                vv="reset action completed.";
            }
            FileWriter f8;
            try{
                File f6 = new File("D:\\voice.txt");
                File f7 = new File("D:\\voice.vbs");
                boolean b = f6.delete();
                boolean a = f7.delete();
                answer.append("opened file\n");
                f8 = new FileWriter("D:\\voice.txt");
             //   BufferedWriter br = new BufferedWriter(f2);
                f8.flush();
                
                answer.append("cleaned previous data\n");
                f8.append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item("+gender+")\nSapi.speak \""+vv+"\"");f8.close();
                
                File f = new File("D:\\voice.txt");
                File fg = new File("D:\\voice.vbs");
                f.renameTo(fg);
                answer.append("Playing voice\n");
                  Runtime.getRuntime().exec( "wscript D:\\voice.vbs" );
                   answer.append("exiting action\n***\n");
                   if(reset==1)
                   {
                       quest.setText("");
                        answer.setText("reset completed successfully :)");
                   }
                
            }
            catch(Exception e){
                answer.setText("error accured");
            }
        }
    }
