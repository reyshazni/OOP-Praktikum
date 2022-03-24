/**
 * LinkedList.java
 * Struktur data linked list yang elemennya dapat menyimpan data dalam jenis tipe
 * data apapun
 * 
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat linked list dengan size = 0 dan head = tail = null
     */
    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Cari elemen yang terletak pada posisi position
     * 
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        Node<T> p = this.head;
        if (position > this.size) {
            return null;
        } else {
            int i = 0;
            while (i < position) {
                p = p.getNext();
                i++;
            }
            return p;
        }
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * 
     * @param item
     */
    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        this.size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * 
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node<T> p = this.head;
        if (position > this.size) {
            return null;
        } else {
            int i = 0;
            while (i < position) {
                p = p.getNext();
                i++;
            }
            return p.getInfo();
        }
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * 
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> p = this.head;
        if (position <= this.size) {
            int i = 0;
            while (i < position) {
                p = p.getNext();
                i++;
            }
            p.setInfo(item);
        }

    }

    /**
     * Hapus elemen pada posisi position jika ada
     * 
     * @param position
     */
    public void remove(int position) {
        Node<T> p = this.head;
        if (position <= this.size) {
            int i = 0;
            while (i < position) {
                p = p.getNext();
                i++;
            }
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else {
                if (p == this.head) {
                    this.head = p.getNext();
                    this.head.setPrev(null);
                } else if (p == this.tail) {
                    this.tail = p.getPrev();
                    this.tail.setNext(null);
                } else {
                    p = p.getPrev();
                    p.setNext((p.getNext()).getNext());
                    (p.getNext()).setPrev(p);
                }
            }
            this.size--;
        }
    }

    /**
     * Hapus semua elemen dari Linked List
     */
    public void clear() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Getter size
     * 
     * @return size
     */
    public int getSize() {
        return this.size;
    }
}