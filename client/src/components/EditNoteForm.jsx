import React, { useState} from 'react'
import { updateNote } from '../api'
import '../styles/EditNoteForm.scss'

const EditNoteForm = ({ note, onUpdate, onCancel }) => {
	const [title, setTitle] = useState(note.title)
	const [content, setContent] = useState(note.content)

	const handleSubmit = async e => {
		e.preventDefault()
		const updatedNote = { title, content }
		await updateNote(note.id, updatedNote)
		onUpdate()
	}

	return (
		<form className='edit-note-form' onSubmit={handleSubmit}>
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
			<button type='submit'>Сохранить</button>
			<button type='button' onClick={onCancel}>
				Отмена
			</button>
		</form>
	)
}

export default EditNoteForm
