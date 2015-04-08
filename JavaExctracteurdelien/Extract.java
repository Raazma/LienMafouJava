import  java.io.*;

public class Extract
{
StringBuffer buffer = new StringBuffer();

   public void Read(String File,String FileDestination)
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

   private void Extraction(StringBuffer fullFile , String FileDestination )
   {
   String line;
   int i = 0;
     try
     {
       PrintWriter  writer = new PrintWriter(
                     new BufferedWriter(
                        new FileWriter( FileDestination) ) );


              while(i< buffer.lastIndexOf("/a>") + 3)
              {
              writer.println(buffer.substring(buffer.indexOf("<a",i), buffer.indexOf("/a>",i) + 3));            
              i = buffer.indexOf("/a>",i) + 3;
              System.out.println(i);
            //  System.out.println(buffer.indexOf("/a>",));
            }
            writer.close();

     }
     catch(IOException e)
      {

      }


   }
   public static void main(String []args)
   {
     Extract tracteur = new Extract();
     tracteur.Read(args[0],args[1]);
   }
}
