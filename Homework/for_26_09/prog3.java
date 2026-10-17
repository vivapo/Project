public class prog3 {
	public static void main(String[] args){
		char c1 = 'И', c2 = 'Т', c3 = 'И', c4 = 'С'; // слово
        long k = 0x2DA295B3; // секретный ключ
        long m = 0;
		long s = 0;
        m = m | ((long) c1 << 48) | ((long) c2 << 32) | ((long) c3 << 16) | ((long) c4);
        System.out.println(m);
        s = m ^ k;
 		System.out.println("Зашифрованное сообщение " + s);
 		m = s ^ k;
		c1 = (char)(m >> 48);
		c2 = (char)(m >> 32);
		c3 = (char)(m >> 16);
		c4 = (char)(m);
		System.out.println("Расшифрованное сообщение " + c1 + c2 + c3 + c4);
   	}
}