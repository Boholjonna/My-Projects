package bohol_act23;

import java.util.Stack;


public class AdvancedTextEditor extends PrintTextEditor {
  private Stack<String> history;



    public AdvancedTextEditor(String initialText) {
         super(initialText);
        this.history = new Stack<>();
        this.history.push(initialText);
    }

   @Override
    public void append(String newText) {
        super.append(newText);
        history.push(super.getText());
    }

    @Override
    public String delete(int n) {
       
         super.delete(n);
        history.push(super.getText());
        return super.getText();
      
    }

    public void undo() {
       if (history.size() > 1) {
            history.pop(); 
            super.setText(history.peek());
        }
    }
        
       
    }

