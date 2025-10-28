class BooksFragment : Fragment(R.layout.fragment_books) {
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        val bookButton: Button = view.findViewById(R.id.btn_view_book_details)
        
        bookButton.setOnClickListener {
            val bookTitle = "Aventura na Montanha"
            val bookDescription = "Uma história épica sobre coragem e descoberta em picos gelados."

            val action = BooksFragmentDirections
                .actionBooksFragmentToBookDetailFragment(bookTitle, bookDescription)

            findNavController().navigate(action)
        }
    }
}
