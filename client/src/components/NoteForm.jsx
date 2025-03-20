import React, { useState } from 'react'
import { createNote } from '../api'


const NoteForm = ({ onNoteCreated }) => {
	const [title, setTitle] = useState('')
	const [content, setContent] = useState('')

	const handleSubmit = async e => {
		e.preventDefault()
		const newNote = { title, content }
		await createNote(newNote)
		onNoteCreated()
		setTitle('')
		setContent('')
	}

	return (
		<form className='note-form' onSubmit={handleSubmit}>
			<input
				type='text'
				placeholder='Заголовок'
				value={title}
				onChange={e => setTitle(e.target.value)}
				required
			/>
			<textarea
				placeholder='Текст заметки'
				value={content}
				onChange={e => setContent(e.target.value)}
				required
			/>
			<button type='submit'>Добавить заметку</button>
		</form>
	)
}

export default NoteForm
