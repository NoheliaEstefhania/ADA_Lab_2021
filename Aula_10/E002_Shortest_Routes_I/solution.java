package E002_Shortest_Routes_I;

import java.io.*;
import java.util.*;

public class solution {
	static Scanner s = new Scanner(System.in);
    static class E {
        int j, w;
        E(int j, int w) {
            this.j = j; this.w = w;
        }
    }
    static ArrayList[] aa;
    static final long INF = 0x3f3f3f3f3f3f3f3fL;
    static long[] dd;
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        int n = s.nextInt();
        int m = s.nextInt();
        aa = new ArrayList[n];
        for (int i = 0; i < n; i++)
            aa[i] = new ArrayList<E>();
        while (m-- > 0) {
            int i = s.nextInt() - 1;
            int j = s.nextInt() - 1;
            int w = s.nextInt();
            aa[i].add(new E(j, w));
        }
        dd = new long[n];
        Arrays.fill(dd, INF);
        dd[0] = 0;
        TreeSet<Integer> pq = new TreeSet<>((i, j) -> dd[i] == dd[j] ? i - j : dd[i] < dd[j] ? -1 : 1);
        pq.add(0);
        Integer i_;
        while ((i_ = pq.pollFirst()) != null) {
            int i = i_;
            ArrayList<E> adj = aa[i];
            for (E e : adj) {
                long d = dd[i] + e.w;
                if (dd[e.j] > d) {
                    if (dd[e.j] != INF)
                        pq.remove(e.j);
                    dd[e.j] = d;
                    pq.add(e.j);
                }
            }
        }
        for (int i = 0; i < n; i++)
            pw.print(dd[i] + " ");
        pw.println();
        pw.close();
    }
    static class _Scanner {
        InputStream is;
        _Scanner(InputStream is) {
            this.is = is;
        }
        byte[] bb = new byte[1 << 15];
        int k, l;
        byte getc() throws IOException {
            if (k >= l) {
                k = 0;
                l = is.read(bb);
                if (l < 0) return -1;
            }
            return bb[k++];
        }
        byte skip() throws IOException {
            byte b;
            while ((b = getc()) <= 32)
                ;
            return b;
        }
        int nextInt() throws IOException {
            int n = 0;
            for (byte b = skip(); b > 32; b = getc())
                n = n * 10 + b - '0';
            return n;
        }
    }
}
