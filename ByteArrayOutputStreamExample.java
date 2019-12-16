import java.io.ByteArrayOutputStream;

class ByteArrayOutputStreamExapmle{
 
    public static void main(String[] args) {
 
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
         
        for (int i=0;i<10;i++) {
            bout.write((byte) (Math.random() * 100));
        }
         
        byte[] byteArray = bout.toByteArray();
        System.out.println("The original array:");
        for (byte b : byteArray)
            System.out.print(b+" ");
         
        bout.reset();
        bout.write(byteArray,4,4);
        System.out.println("\nThe new byte array:");
        for (byte b : bout.toByteArray())
            System.out.print(b+" ");
             
    }
 
}
