import javax.swing.JLabel;

public class Table extends JLabel{
	public int playernum;
	public Table(){
		playernum=0;
	}
	public boolean Isfull(){
		if(playernum==5)
			return true;
		return false;
	}
	
}
