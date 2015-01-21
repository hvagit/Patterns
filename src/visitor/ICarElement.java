package visitor;

public interface ICarElement {
    void accept(ICarElementVisitor visitor); // CarElements have to provide accept().
}