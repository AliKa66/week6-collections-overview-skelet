package be.pxl.collections.linkedlist;

import java.util.LinkedList;

public class Browser {

    private LinkedList<Page> backward = new LinkedList<>();
    private LinkedList<Page> forward = new LinkedList<>();
    private Page currentPage;

    public Browser() {
        currentPage = new Page("www.google.be");
        showCurrentPage();
    }


    public void visit(String url) {
        backward.addLast(currentPage);
        currentPage = new Page(url);
        showCurrentPage();
        System.out.println("Displaying: " + url);
    }

    private void showCurrentPage() {
        System.out.println("**** " + currentPage.url + " ****");
    }

    public void back() {
        forward.addFirst(currentPage);
        currentPage = backward.pollLast();
        showCurrentPage();
    }

    public void forward() {
        backward.addLast(currentPage);
        currentPage = forward.pollFirst();
        showCurrentPage();

    }



    private class Page {
        private String url;

        public Page(String url) {
            this.url = url;
        }
    }

}
