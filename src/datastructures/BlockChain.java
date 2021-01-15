package datastructures;

import java.util.Date;
import java.util.Random;

public class BlockChain {

    Block firstBlock;

    public static void main(String args[]) {

        BlockChain b = new BlockChain();
        b.addBlock("ved");
        b.addBlock("anup");
        b.addBlock("soniya");

        b.showBlocks();

    }

    public void addBlock (String data) {

        if (firstBlock == null) {
            firstBlock = new Block(0, data);
        } else {
            Block cBlock = firstBlock;

            while(cBlock.next != null) {
                cBlock = cBlock.next;
            }
            cBlock.next = new Block(cBlock.current, data);
        }

    }

    public void showBlocks () {
        Block bl = firstBlock;
        while (bl.next != null) {
            System.out.print(bl.toString());
            System.out.println("*****************************************************************************");
            bl = bl.next;
        }
    }

    class Block {
        int prev;
        int current;
        String data;
        Date date;
        int num;
        Block next;
        int MAX = 20;

        Block (int prev, String data) {
            this.prev = prev;
            this.current = this.getHash(data);
            this.data = data;
            this.date = new Date();
            this.num = this.getNum();
            this.next = null;
        }

        private int getHash (String data) {
            int hash = data.hashCode() % MAX;
            System.out.println("hash - " + hash);
            return hash;
        }

        private int getNum () {
            Random r = new Random();
            return r.nextInt();
        }

        @Override
        public String toString() {
            return "Block{" +
                    "prev=" + prev +
                    ", current=" + current +
                    ", data='" + data + '\'' +
                    ", date=" + date +
                    ", num=" + num +
                    ", next=" + next +
                    '}';
        }
    }
}
