/* 
    Abdullah Mohammed Bajaman
    abajaman0002@stu.kau.edu.sa
    CPCS204
    ZA1 
    Spell Checker 
    10 / July / 2020  
 */
package spellchecker;

public class englishWords {

    private englishWord root;

    public englishWords() {
    }

    public englishWords(englishWord root) {
        this.root = null;
    }

    public boolean isEmpty() 
    {
        // checking if the root is empty ..  
        return (root == null);
    }

    public boolean search(String data)  
    {
        // sending the root to the SEARCH method for a specific word ..
        return search(root, data);
    }

    public boolean search(englishWord root, String word) 
        // this method will perform SEARCH on a specific word by going through the tree ..     
    {
        
        englishWord helpPtr = root;
        // if the root is empty, it will return False .. 
        if (helpPtr == null) 
        {
            return (false);
        }
        if (word.compareTo(helpPtr.getWord()) >= 0) 
        {
            // going to the right subtree .. 
            return search(helpPtr.getRight(), word);
        }
        else if (word.compareTo(helpPtr.getWord()) < 0)
        {
            // going to the left subtree .. 
            return search(helpPtr.getLeft(), word);
        }
        else 
        {
            // if the word is found, return TRUE ..
            return (true);
        }
    }

    public void insert(String word) 
    {
        root = insert(root, word);
    }

    public englishWord insert(englishWord root, String word) {
        if (root == null)
        {
            // create the new node with the given word as a root .. 
            root = new englishWord(word);
        } 
        else {
            
            if (word.compareTo(root.getWord()) >= 0) 
            {
                // if the word is bigger than the root, we'll go right .. 
                root.setRight(insert(root.getRight(), word));
            } 
            else 
            {
                // if the word is smaller than the root, we'll go left .. 
                root.setLeft(insert(root.getLeft(), word));
            }

        }
        return root;
    }

    public englishWord getRoot() {
        return root;
    }

    public void setRoot(englishWord root) {
        this.root = root;
    }

}
