package DataStructure;

/**
 * Created by Danay on 6/13/17.
 */
public class LLNode<DataType> {

    private DataType data; //stores information
    private LLNode<DataType> link; //points to the next node

    public LLNode(DataType data) {
        this.data = data;
        link = null;
    }

    public void setData(DataType data) {
        this.data = data;
    }

    public DataType getData() {
        return data;
    }

    public void setLink(LLNode<DataType> link) {
        this.link = link;
    }

    public LLNode<DataType> getLink() {
        return link;
    }
}
