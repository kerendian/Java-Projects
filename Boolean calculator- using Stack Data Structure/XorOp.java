
public class XorOp extends BinaryOp implements CalcToken {
	char xorop;
	
	public XorOp(){
		super('^');
		this.xorop = '^';}
	
	/**
	 * Return the precedence value of this operation
	 * @return the precedence of this operation.
	 */
	public double getPrecedence() {
		return 3.0; }
	
	/**
	 * Return the result of this operation on its operands.
	 * @param left the left operand.
	 * @param right the right operand.
	 * @return the result of the operation.
	 */
	public boolean operate(boolean left, boolean right) {
		return left^right; }
	}
