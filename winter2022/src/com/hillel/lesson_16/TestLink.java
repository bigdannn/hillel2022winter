package com.hillel.lesson_16;

public class TestLink {

    public static void main(String[] args) {

        Link link = new Link();
        sLink(sLink(link));

    }

    static Link sLink(Link link){
        link.setLink(link);
        return link;
    }
}


class Link{
    Link link;

    public void setLink(Link link) {
        this.link = link;
    }
}