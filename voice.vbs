Set Sapi = Wscript.CreateObject("SAPI.SpVoice")
Set sapi.Voice = sapi.GetVoices.Item(0)
Sapi.speak "hello nice to meet you, you said hi."