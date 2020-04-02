# Text To Voice Converter in Java GUI

# objective: to convert given text into voice in windows

# usage:Voicespeaker object =new Voicespeaker(string);

# Source code for merging with other codes:

class Voicespeaker

    {
        String gender="0"; //0 means male voice and 1 means female voice
        Voicespeaker(String vv){
            //if(zira.isSelected())
           // {
            //    gender="1"; //you can use this code to customize the voices
            //}
            if(vv.equals("what is computer"))
            {
                vv="it's me, computer is a electronic device which processes given input and gives you final output.";
            }
            FileWriter f8;
            try{
                File f6 = new File("D:\\voice.txt");
                File f7 = new File("D:\\voice.vbs");
                boolean b = f6.delete();//deleting previous text file
                boolean a = f7.delete();//deleting previous voice file
                f8 = new FileWriter("D:\\voice.txt");
                f8.flush();
                f8.append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item("+gender+")\nSapi.speak \""+vv+"\"");f8.close();
                File f = new File("D:\\voice.txt");
                File fg = new File("D:\\voice.vbs");
                f.renameTo(fg);
                Runtime.getRuntime().exec( "wscript D:\\voice.vbs" );             
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    Thank you
    
    -Sijan Bhandari
    
    This project is created by using VBS Script developed by Microsoft.
