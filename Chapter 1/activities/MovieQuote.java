package activities;
import javax.swing.JOptionPane;
public class MovieQuote {
   public static void main(String[] args){

      String favoriteMovieQuote = "Wait, you said you never give up." + 
		" In war, yes. In life, not so easy.";		
		String quoteInfo = "Movie Title: Hidden Strike || Year of Movie: 2023 ";
      
      JOptionPane.showMessageDialog(null, favoriteMovieQuote);
		JOptionPane.showMessageDialog(null, quoteInfo);
   }
}