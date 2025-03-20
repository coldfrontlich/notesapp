import axios from 'axios';

const API_URL = 'http://localhost:8080/api/v1/notes'

export const getNotes = async () => {
  try {
    const response = await axios.get(API_URL);
    return response.data;
  } catch (error) {
    console.error('Error fetching notes:', error);
    throw error;
  }
}

export const createNote = async(note) => {
  try {
    const response = await axios.post(`${API_URL}/create`, note)
    return response.data
  } catch (error) {
    console.error('Error add note:', error)
    throw error
  }
}

export const updateNote = async(id,note) => {
	try {
		const response = await axios.put(`${API_URL}/update/${id}`, note)
		return response.data
	} catch (error) {
		console.error('Error update note:', error)
		throw error
	}
}

export const deleteNote = async (id) => {
	try {
		await axios.delete(`${API_URL}/delete/${id}`)
	} catch (error) {
		console.error('Error deleting note:', error)
		throw error
	}
}