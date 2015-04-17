import  java.io.*;

public class Extract
{
StringBuffer buffer = new StringBuffer();

   public void Read(String File,String FileDestination)
   {
    File f = new File(File);
    
      if(f.exists())
      {
      try
      {
      
      
       BufferedReader reader =  reader = new BufferedReader(
               new FileReader(File) );
        String line;

         while((line = reader.readLine())!= null)
             buffer.append(line);

             reader.close();
            Extraction(buffer,FileDestination);
       }
       catch(IOException e)
       {
       }
       Extraction(buffer,FileDestination);
       }
       else
       {
         System.out.println("Fichier Introuble écrit comme du monde");
       }

   }

   private void Extraction(StringBuffer fullFile , String FileDestination )
   {
   String line;
   int i = 0;
     try
     {
       PrintWriter  writer = new PrintWriter(
                     new BufferedWriter(
                        new FileWriter( FileDestination) ) );

              while(i < buffer.lastIndexOf("/a>") )
              writer.println(buffer.substring(buffer.indexOf("<a ",i),i=buffer.indexOf("/a>",i) + 3));

           writer.close();

     }
     catch(IOException e)
      {

      }


   }
   public static void main(String []args)
   {
     Extract tracteur = new Extract();
     if(args.length ==2)
     tracteur.Read(args[0],args[1]);
     else
     System.out.println("Je veux 2 Parametre mautadine que tu es dur de comprenure");
   }
}
