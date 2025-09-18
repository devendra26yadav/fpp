package Assignments.Assignment7.problem3;

public class TestBrowserHistory {
    public static void main(String[] args) {
        BrowserHistoryNavigation browser = new BrowserHistoryNavigation("home.html");
        browser.visit("page1.html");
        browser.visit("page2.html");
        browser.back();
        browser.back();
        browser.back();
        browser.forward();
        browser.forward();
        browser.forward();
        browser.visit("page3.html");
    }
}
/*
Sample Output:
Visited: page1.html
Visited: page2.html
Back to: page1.html
Back to: home.html
No history to go back
Forward to: page1.html
Forward to: page2.html
No forward history
Visited: page3.html

 */