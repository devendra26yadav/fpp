package Assignments.Assignment7.problem3;

import java.util.Stack;

public class BrowserHistoryNavigation {

    private  Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentUrl;
    public BrowserHistoryNavigation(String homepage){
        if (homepage == null || homepage.trim().isEmpty()) {
            throw new IllegalArgumentException("No empty Home page.");
        }
        this.currentUrl = homepage;
    }

    public void visit(String url){
        if(url==null || url.trim().isEmpty()) return;
        backStack.push(currentUrl);
        currentUrl=url;
        forwardStack.clear();
        System.out.println("Visited: "+currentUrl);
    }
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back");
            return;
        }
        forwardStack.push(currentUrl);
        currentUrl = backStack.pop();
        System.out.println("Back to: " + currentUrl);
    }
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history");
            return;
        }
        backStack.push(currentUrl);
        currentUrl = forwardStack.pop();
        System.out.println("Forward to: " + currentUrl);
    }
}
