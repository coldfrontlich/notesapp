import React from 'react'


const NoteItem = ({ note, onDelete }) => {
	return (
		<div className='note-item'>
			<h3>{note.title}</h3>
			<p>{note.content}</p>
			<p>{new Date(note.createdAt).toLocaleDateString()}</p>
			<button onClick={() => onDelete(note.id)}>Удалить</button>
		</div>
	)
}

export default NoteItem
